package org.hibernate.tutorial.em;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Puesto {

	@Id
	private String nombre;
	private String descripcion;

	public Puesto(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

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

}
