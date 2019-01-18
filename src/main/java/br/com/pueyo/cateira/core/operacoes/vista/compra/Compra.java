package br.com.pueyo.cateira.core.operacoes.vista.compra;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.pueyo.cateira.core.operacoes.vista.OperacaoVista;

public class Compra extends OperacaoVista {

    @Override
    public BigDecimal calculaValorOperacao() {
        BigDecimal valorBruto = this.quantidade.multiply(this.valorUnitario);
        return valorBruto
                .add(this.emolumentos)
                .add(this.taxaCorretagem)
                .add(this.taxaLiquidacao)
                .add(this.taxaRegistro)
                .add(this.iss).setScale(2, RoundingMode.HALF_EVEN);
    }
    
    
    

}
