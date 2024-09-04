package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> desvsInscritos = new HashSet<Dev>();
    private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return this.dataInicial;
    }


    public LocalDate getDataFinal() {
        return this.dataFinal;
    }


    public Set<Dev> getDesvsInscritos() {
        return this.desvsInscritos;
    }

    public void setDesvsInscritos(Set<Dev> desvsInscritos) {
        this.desvsInscritos = desvsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return this.conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }


}
