package com.example.demo.service;

import com.example.demo.model.Furniture;
import com.example.demo.repo.FurnitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureService {

    @Autowired
    FurnitureRepo furnitureRepo;

    public List<Furniture> getAll(){
        return furnitureRepo.findAll();
    }
}
