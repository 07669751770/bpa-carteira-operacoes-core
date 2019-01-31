package br.com.pueyo.cateira.core.operacoes.vista.desdobramento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.pueyo.cateira.core.operacoes.vista.InclusaoOperacoesAware;
import br.com.pueyo.cateira.core.operacoes.vista.OperacaoVista;

public class Desdobramento extends OperacaoVista implements InclusaoOperacoesAware {
    
    private List<OperacaoVista> listaOperacaoVista;
    private BigDecimal total = BigDecimal.ZERO;

    @Override
    public BigDecimal calculaValorOperacao() {
        return BigDecimal.valueOf(listaOperacaoVista.stream()
                .mapToDouble(i -> i.calculaValorOperacao().doubleValue()).sum() / this.total.doubleValue());
    }

    @Override
    public void incluirOperacao(OperacaoVista operacao) {
        if(listaOperacaoVista == null) {
            listaOperacaoVista = new ArrayList<OperacaoVista>();
        }
        listaOperacaoVista.add(operacao);
        this.total = this.total.add(operacao.getQuantidade());

    }
    
    
    
    

}
