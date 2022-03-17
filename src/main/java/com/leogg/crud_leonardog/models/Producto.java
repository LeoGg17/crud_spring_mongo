package com.leogg.crud_leonardog.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 

@Document(collection ="productos")
public class Producto{
	@Id
    private String _id;

    private String nombre;
    
    private Double precio;

    private LocalDate date_exp;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public LocalDate getDate_exp() {
		return date_exp;
	}

	public void setDate_exp(LocalDate date_exp) {
		this.date_exp = date_exp;
	}
    
    
}
