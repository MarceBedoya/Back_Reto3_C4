package com.reto2.interfaces;

import com.reto2.model.CleaningProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CleaningProductInterface extends MongoRepository<CleaningProduct, Integer> {

}
