package com.github.lucasfo_dev.aula02.dto;

import java.util.List;

public class ProdutoResponseDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Double valor;

    public ProdutoResponseDTO(Long id, String nome, String descricao, Double valor) {
        id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

//    public static ProdutoResponseDTO creaMock(){
//        ProdutoResponseDTO responseDTO = new
//                ProdutoResponseDTO(1L, "Smart TV", "Smart TV LG LED 50 polegadas", 2285.0);
//        return responseDTO;
//    }

    public static List<ProdutoResponseDTO> creaMock(){
        return List.of(
                    new ProdutoResponseDTO(1L, "Smart TV", "Smart TV LG LED 50 polegadas", 2285.0),
                    new ProdutoResponseDTO(2L, "Mouse Microsoft", "Mouse sem fio", 250.0),
                    new ProdutoResponseDTO(3L, "Teclado Microsoft", "Teclado sem fio", 278.95)
                );
    }

    public Long getId() {
        return id;
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
