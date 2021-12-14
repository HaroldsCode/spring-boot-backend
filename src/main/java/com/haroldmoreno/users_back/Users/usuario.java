package com.haroldmoreno.users_back.Users;

import javax.persistence.*;

import com.haroldmoreno.users_back.rol.rol;

@Entity(name="usuario")
public class usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Integer id_usuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
    @JoinColumn(name = "id_rol")
	private rol rol;
	
	@Column(name="activo")
	private char activo;
	
	public usuario() { }

	public usuario(Integer id_usuario, String nombre, rol rol, char activo) {
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.rol = rol;
		this.activo = activo;
	}

	public usuario(String nombre, rol rol, char activo) {
		this.nombre = nombre;
		this.rol = rol;
		this.activo = activo;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public rol getRol() {
		return rol;
	}

	public void setRol(rol rol) {
		this.rol = rol;
	}

	public char getActivo() {
		return activo;
	}

	public void setActivo(char activo) {
		this.activo = activo;
	}
	
}
