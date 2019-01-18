package br.com.pueyo.cateira.core.operacoes.utilidades;

import java.math.BigDecimal;

public class ValoresUtils {
    
    private ValoresUtils() {}
    
   public static class FromDouble{
        
        private FromDouble() {}
        
        public static BigDecimal toBigDecimal(double valor) {
            return BigDecimal.valueOf(valor);
        }
    }

}
