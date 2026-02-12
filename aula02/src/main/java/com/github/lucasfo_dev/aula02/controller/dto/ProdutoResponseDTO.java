package com.github.lucasfo_dev.aula02.controller.dto;

public class ProdutoResponseDTO {

    private Long Id;
    private String nome;
    private String descricao;
    private Double valor;

    public ProdutoResponseDTO(Long id, String nome, String descricao, Double valor) {
        Id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public static ProdutoResponseDTO creaMock(){
        ProdutoResponseDTO responseDTO = new
                ProdutoResponseDTO(1L, "Smart TV", "Smart TV LG LED 50 polegadas", 2285.0);
        return responseDTO;
    }

    public Long getId() {   
        return Id;
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
