package com.leogg.crud_leonardog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leogg.crud_leonardog.models.Producto;
import com.leogg.crud_leonardog.repository.ProductoRepository;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("api/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productosDAO;

    @PostMapping
    public ResponseEntity<Producto> create(@RequestBody Producto productos){
        return new ResponseEntity<Producto>(productosDAO.insert(productos), HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity<List<Producto>> readAll(){
        return new ResponseEntity<List<Producto>>(productosDAO.findAll(), HttpStatus.ACCEPTED);
    }
    @PutMapping
    public ResponseEntity<Producto> update(@RequestBody Producto productos){
        return new ResponseEntity<Producto>(productosDAO.save(productos), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        productosDAO.deleteById(id);
        return new ResponseEntity(null, HttpStatus.OK);
    }
    }
