package br.com.pueyo.cateira.core.operacoes.vista;

import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class OperacaoVista {

    protected BigDecimal taxaCorretagem;
    protected BigDecimal taxaLiquidacao;
    protected BigDecimal taxaRegistro;
    protected BigDecimal emolumentos;
    protected BigInteger quantidade;
    
    public void comTaxaCorretagem(BigDecimal taxaCorretagem) {
        this.taxaCorretagem = taxaCorretagem;
    }
    public void comTaxaLiquidacao(BigDecimal taxaLiquidacao) {
        this.taxaLiquidacao = taxaLiquidacao;
    }
    public void comTaxaRegistro(BigDecimal taxaRegistro) {
        this.taxaRegistro = taxaRegistro;
    }
    public void comEmolumentos(BigDecimal emolumentos) {
        this.emolumentos = emolumentos;
    }
    public void comQuantidade(BigInteger quantidade) {
        this.quantidade = quantidade;
    }
    
    public abstract BigDecimal calculaValorOperacao();
    
    
    
    
    
    
}
