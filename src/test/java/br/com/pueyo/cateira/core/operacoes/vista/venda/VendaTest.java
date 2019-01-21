package br.com.pueyo.cateira.core.operacoes.vista.venda;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.pueyo.cateira.core.operacoes.utilidades.ValoresUtils;
import br.com.pueyo.cateira.core.operacoes.vista.OperacaoVista;

@RunWith(MockitoJUnitRunner.class)
public class VendaTest {

    @Test
    public void testCalculaValorOperacao() {
        
        BigDecimal valorEsperado = BigDecimal.valueOf(19595.89).setScale(2, RoundingMode.HALF_EVEN);
        
        OperacaoVista venda = new Venda();
        venda.comEmolumentos(ValoresUtils.FromDouble.toBigDecimal(0.96));
        venda.comIss(ValoresUtils.FromDouble.toBigDecimal(1.56));
        venda.comQuantidade(ValoresUtils.FromDouble.toBigDecimal(400));
        venda.comTaxaCorretagem(ValoresUtils.FromDouble.toBigDecimal(16.20));
        venda.comTaxaLiquidacao(ValoresUtils.FromDouble.toBigDecimal(5.39));
        venda.comValorUnitario(ValoresUtils.FromDouble.toBigDecimal(49.05));
        
        assertEquals(valorEsperado, venda.calculaValorOperacao());
    }

}
