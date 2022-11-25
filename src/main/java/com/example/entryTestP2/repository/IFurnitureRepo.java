package com.example.entryTestP2.repository;


import com.example.entryTestP2.entity.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFurnitureRepo extends JpaRepository<Furniture,Long> {
}
