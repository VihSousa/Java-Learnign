package com.example.DIO;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter
public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();
    
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        } else {
            System.out.println("Sem matrícula ativa");
        }
    }

    public double calcularXpTotal() {
        return this.conteudoConcluido
            .stream()
            .mapToDouble(conteudo -> conteudo.calcularXp())
            .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Dev dev = (Dev)o;
            return Objects.equals(this.nome, dev.nome) && Objects.equals(this.conteudoInscrito, dev.conteudoInscrito) && Objects.equals(this.conteudoConcluido, dev.conteudoConcluido);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.nome, this.conteudoInscrito, this.conteudoConcluido});
    }

}
