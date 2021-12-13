package com.reto2.repository;

import com.reto2.model.CleaningProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import com.reto2.interfaces.CleaningProductInterface;

@Repository
public class CleaningProductRepository {
    @Autowired
    private CleaningProductInterface cleaningprodCrudRepository;

    public List<CleaningProduct> getAll() {
        return cleaningprodCrudRepository.findAll();
    }

    public Optional<CleaningProduct> getClothe(Integer id) {
        return cleaningprodCrudRepository.findById(id);
    }

    public CleaningProduct create(CleaningProduct cleaningprod) {
        return cleaningprodCrudRepository.save(cleaningprod);
    }

    public void update(CleaningProduct cleaningprod) {
        cleaningprodCrudRepository.save(cleaningprod);
    }

    public void delete(CleaningProduct cleaningprod) {
        cleaningprodCrudRepository.delete(cleaningprod);
    }
}
