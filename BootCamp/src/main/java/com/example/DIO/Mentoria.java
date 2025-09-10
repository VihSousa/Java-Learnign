package com.example.DIO;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mentoria extends Conteudo{
        
    private LocalDate Data;
    
    @Override
    public double calcularXp() {
        return XP_Padrao + 10d;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", Descricao=" 
        + getDescricao() + ", Data=" + Data + "]";
    }

    

}
