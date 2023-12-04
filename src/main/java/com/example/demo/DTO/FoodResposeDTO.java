package com.example.demo.DTO;

import com.example.demo.entity.FoodEntity;

public record FoodResposeDTO(Long id, String titulo, String imagem, Integer preco) {
    public FoodResposeDTO(FoodEntity food) {
        this(food.getId(), food.getTitulo(), food.getImagem(), food.getPreco());
    }
}
