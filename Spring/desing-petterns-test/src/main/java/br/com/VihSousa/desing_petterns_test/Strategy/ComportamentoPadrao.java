package br.com.VihSousa.desing_petterns_test.Strategy;

public class ComportamentoPadrao implements Comportamento {
    
    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }

}
