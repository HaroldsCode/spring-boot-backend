package com.haroldmoreno.users_back.rol;

import javax.persistence.*;

@Entity(name="rol")
public class rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_rol")
	private Integer id_rol;
	
	@Column(name="nombre")
	private String nombre;
	
	public rol() {
	}
	public rol(String nombre) {
		this.nombre = nombre;
	}
	public rol(Integer id_rol, String nombre) {
		this.id_rol = id_rol;
		this.nombre = nombre;
	}
	public Integer getId_rol() {
		return id_rol;
	}
	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
