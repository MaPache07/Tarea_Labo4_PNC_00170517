package com.uca.capas.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	@Size(max=15, message="El nombre no debe tener mas de 15 caracteres")
	@NotEmpty(message="El campo nombre no puede ir vacio")
	private String nombre;
	@Size(max=15, message="La descripcion no debe tener mas de 30 caracteres")
	@NotEmpty(message="El campo descripcion no puede ir vacio") 
	private String descripcion;
	@NotNull(message="El campo precio no puede ir vacio")
	@Min(value=0, message="El precio no debe ser negativo")
	private Double precio;
	@NotEmpty(message="El campo vencimiento no puede estar vacio")
	@Pattern(regexp="^$|(((([0-2][0-9])|3[0-1])(/|-)((01|03|05|07|08|10|12)|(1|3|5|7|8|10|12)))|((([0-1][0-9])|2[0-8])(/|-)(02|2))|((([0-2][0-9])|30)(/|-)((04|06|09|11)|(4|6|9|11))))(/|-)([0-12]{4})", 
			message="La fecha ingresada debe seguir el formato dd/mm/yyyy")
	private String vencimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
}
