package com.example.demo.repo;

import com.example.demo.model.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FurnitureRepo extends JpaRepository<Furniture, Integer> {

    List<Furniture> findAll();

    List<Furniture> findAllById(Long id);
}
