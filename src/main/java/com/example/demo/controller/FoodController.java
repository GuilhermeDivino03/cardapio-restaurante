package com.example.demo.controller;

import com.example.demo.DTO.FoodResposeDTO;
import com.example.demo.DTO.FoodResquestDTO;
import com.example.demo.entity.FoodEntity;
import com.example.demo.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;
    @GetMapping
    public List<FoodResposeDTO> getAll(){
        List<FoodResposeDTO> listaFoods = foodRepository.findAll().stream().map(FoodResposeDTO::new).toList();
        return listaFoods;
    }

    @PostMapping
    public void cadastrarFoo(@RequestBody FoodResquestDTO data){
        FoodEntity foodData = new FoodEntity(data);
        foodRepository.save(foodData);
        return;
    }
}
