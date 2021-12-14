package com.haroldmoreno.users_back.rol;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/rol")
public class rolController {
	
	private final rolService sRol;
	
	public rolController(rolService sRol) {
		this.sRol = sRol;
	}

	@GetMapping
	public List<rol> getRol() {
		return sRol.getRol();
	}

}
