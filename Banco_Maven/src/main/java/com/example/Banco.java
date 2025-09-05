package com.example;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private String nome;

    private Map<Integer, Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new HashMap<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.put(conta.getNumero(), conta);
    }

    public Conta acessarConta(int numero) {
        return this.contas.get(numero);
    }
    
    public String getNome() {
        return nome;
    }
}