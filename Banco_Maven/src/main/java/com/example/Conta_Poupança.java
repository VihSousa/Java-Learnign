package com.example;
public class Conta_Poupança extends Conta {

    public Conta_Poupança(Cliente cliente) {
        super(cliente); // Chama o construtor da classe pai (Conta)
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" === Extrato Conta Poupança === ");
        super.imprimirInfoComun();
    }

}
