package br.com.VihSousa.desing_petterns_test.Strategy;

public class Robo { 

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
    
}
