package br.com.pueyo.cateira.core.operacoes.vista;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class OperacaoVista {

    protected BigDecimal taxaCorretagem = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
    protected BigDecimal taxaLiquidacao = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
    protected BigDecimal taxaRegistro = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
    protected BigDecimal emolumentos = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
    protected BigDecimal quantidade = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
    protected BigDecimal valorUnitario = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
    protected BigDecimal iss = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
    
    public void comTaxaCorretagem(BigDecimal taxaCorretagem) {
        this.taxaCorretagem = taxaCorretagem.setScale(2, RoundingMode.HALF_EVEN);
    }
    public void comTaxaLiquidacao(BigDecimal taxaLiquidacao) {
        this.taxaLiquidacao = taxaLiquidacao.setScale(2, RoundingMode.HALF_EVEN);
    }
    public void comTaxaRegistro(BigDecimal taxaRegistro) {
        this.taxaRegistro = taxaRegistro.setScale(2, RoundingMode.HALF_EVEN);
    }
    public void comEmolumentos(BigDecimal emolumentos) {
        this.emolumentos = emolumentos.setScale(2, RoundingMode.HALF_EVEN);
    }
    public void comQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade.setScale(2, RoundingMode.HALF_EVEN);
    }
    public void comValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario.setScale(2, RoundingMode.HALF_EVEN);
    }
    public void comIss(BigDecimal iss) {
        this.iss = iss.setScale(2, RoundingMode.HALF_EVEN);
    }    
    public abstract BigDecimal calculaValorOperacao();

  
    
    
    
    
    
    
}
