package com.example.entryTestP2.service.furniture;

import com.example.entryTestP2.entity.Furniture;
import com.example.entryTestP2.repository.IFurnitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FurnitureService implements IFurnitureService {
    @Autowired
    private IFurnitureRepo furnitureRepo;

    @Override
    public Iterable<Furniture> findAll() {
        return furnitureRepo.findAll();
    }

    @Override
    public Optional<Furniture> findById(Long id) {
        return furnitureRepo.findById(id);
    }

    @Override
    public Furniture save(Furniture furniture) {
        return furnitureRepo.save(furniture);
    }
}
