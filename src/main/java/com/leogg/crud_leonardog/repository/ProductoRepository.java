package com.leogg.crud_leonardog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository; 
import com.leogg.crud_leonardog.models.Producto;

@Repository
public interface ProductoRepository extends MongoRepository<Producto,String> {
}