package br.com.pueyo.cateira.core.operacoes;


import br.com.pueyo.cateira.core.operacoes.vista.OperacaoVista;
import br.com.pueyo.cateira.core.operacoes.vista.compra.Compra;


public enum OperacoesVista {
    
    COMPRA(){

        @Override
        public OperacaoVista getOperacao() {
            return new Compra();
        }
        
    };
    
    
    
    private OperacoesVista() {
        
    }
    public abstract OperacaoVista getOperacao();

}
