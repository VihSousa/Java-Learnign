package br.com.VihSousa.desing_petterns_test.Strategy;

public class ComportamentoDefensivo implements Comportamento {
    
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }

}
