package com.example.DIO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso extends Conteudo{

    private double carga_horaria;
    
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao="
         + getDescricao() + ", carga_horaria=" + carga_horaria + "]";
    }

    @Override
    public double calcularXp() {
        return XP_Padrao * carga_horaria;
    }

}
