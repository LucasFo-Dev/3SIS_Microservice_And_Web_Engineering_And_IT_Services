package com.github.lucasfo_dev.aula02.dto;

public class ProdutoInputDTO {
    private String nome;
    private String descricao;
    private Double valor;

    public ProdutoInputDTO(String nome, String descricao, Double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
