package com.example;
public interface IConta {
    
    void sacar(double valor) ;
    void depositar(double valor);
    void transferir(double valor, Conta conta_destino);
    void imprimirExtrato();

}
