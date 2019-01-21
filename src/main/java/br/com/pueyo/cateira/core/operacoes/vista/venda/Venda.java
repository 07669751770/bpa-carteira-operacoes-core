package br.com.pueyo.cateira.core.operacoes.vista.venda;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.pueyo.cateira.core.operacoes.vista.OperacaoVista;

public class Venda extends OperacaoVista {

    @Override
    public BigDecimal calculaValorOperacao() {
        BigDecimal valorBruto = this.quantidade.multiply(this.valorUnitario);

        return valorBruto
                .subtract(this.emolumentos)
                .subtract(this.taxaCorretagem)
                .subtract(this.taxaLiquidacao)
                .subtract(this.taxaRegistro)
                .subtract(this.iss).setScale(2, RoundingMode.HALF_EVEN);
    }

}
