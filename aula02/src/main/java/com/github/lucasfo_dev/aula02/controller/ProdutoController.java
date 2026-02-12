package com.github.lucasfo_dev.aula02.controller;

import com.github.lucasfo_dev.aula02.controller.dto.ProdutoResponseDTO;
import com.github.lucasfo_dev.aula02.entities.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {

//    @GetMapping
//    public ResponseEntity<List<Produto>> getProduto(){
//        List <Produto> produtos = new ArrayList<>();
//        produtos.add(new Produto(1L, "Smart TV", "Smart TV LG LED 50 polegadas", 2285.0));
//        produtos.add(new Produto(2L, "Mouse Microsoft", "Mouse sem fio", 250.0));
//        produtos.add(new Produto(3L, "Teclado Microsoft", "Teclado sem fio", 278.95));
//
//        return ResponseEntity.ok(produtos);
//    }

    @GetMapping
    public ResponseEntity<ProdutoResponseDTO> getProduto(){
        ProdutoResponseDTO dto = ProdutoResponseDTO.creaMock();
        return ResponseEntity.ok(dto);
    }

}
