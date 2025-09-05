package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta{
    
    private static int agencia_padrao = 1;
    private static int sequencial = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) { //Contrutor
        this.agencia = agencia_padrao;
        this.numero = sequencial++;
        this.cliente = cliente;
    }

    //////////////////// Métodos \\\\\\\\\\\\\\\\\\\\

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta conta_destino) {
        this.sacar(valor);
        conta_destino.depositar(valor);
    }
    
    protected void imprimirInfoComun() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    
}
