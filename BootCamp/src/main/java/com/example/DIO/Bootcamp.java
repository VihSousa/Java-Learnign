package com.example.DIO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Bootcamp {
    
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         Bootcamp bootcamp = (Bootcamp)o;
         return Objects.equals(this.nome, bootcamp.nome) && Objects.equals(this.descricao, bootcamp.descricao) && Objects.equals(this.dataInicial, bootcamp.dataInicial) && Objects.equals(this.dataFinal, bootcamp.dataFinal) && Objects.equals(this.devsInscritos, bootcamp.devsInscritos) && Objects.equals(this.conteudos, bootcamp.conteudos);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.nome, this.descricao, this.dataInicial, this.dataFinal, this.devsInscritos, this.conteudos});
   }


}
