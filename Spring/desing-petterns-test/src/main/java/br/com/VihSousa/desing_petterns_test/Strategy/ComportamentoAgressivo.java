package br.com.VihSousa.desing_petterns_test.Strategy;

public class ComportamentoAgressivo implements Comportamento {
    
    @Override
    public void mover() {
        System.out.println("Movendo-se Agressivamente...");
    }

}
