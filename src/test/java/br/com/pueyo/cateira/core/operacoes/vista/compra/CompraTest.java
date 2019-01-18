package br.com.pueyo.cateira.core.operacoes.vista.compra;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.pueyo.cateira.core.operacoes.utilidades.ValoresUtils;
import br.com.pueyo.cateira.core.operacoes.vista.OperacaoVista;

@RunWith(MockitoJUnitRunner.class)
public class CompraTest {

    @Test
    public void testCalculaValorOperacao() {
        
        BigDecimal valorEsperado = BigDecimal.valueOf(2034.50).setScale(2, RoundingMode.HALF_EVEN);
        
        OperacaoVista compra = new Compra();
        compra.comEmolumentos(ValoresUtils.FromDouble.toBigDecimal(0.09));
        compra.comIss(ValoresUtils.FromDouble.toBigDecimal(0.86));
        compra.comQuantidade(ValoresUtils.FromDouble.toBigDecimal(400));
        compra.comTaxaCorretagem(ValoresUtils.FromDouble.toBigDecimal(9.00));
        compra.comTaxaLiquidacao(ValoresUtils.FromDouble.toBigDecimal(0.55));
        compra.comValorUnitario(ValoresUtils.FromDouble.toBigDecimal(5.06));
        
        assertEquals(valorEsperado, compra.calculaValorOperacao());
    }

}
