package com.example;
public class Conta_Corrente extends Conta {

    public Conta_Corrente(Cliente cliente) {
        super(cliente); // Chama o construtor da classe pai (Conta)
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" === Extrato Conta Corrente === ");
        super.imprimirInfoComun();
    }

}
