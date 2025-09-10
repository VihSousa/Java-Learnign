package com.example.DIO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo {
    
    protected static final double XP_Padrao = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();


}
