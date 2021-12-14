package com.haroldmoreno.users_back.rol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;


@Service
public class rolService {
	
	@Autowired
	private rolRepository rRol;

	public rolService(rolRepository rRol) {
		this.rRol = rRol;
	}
	
	public @ResponseBody List<rol> getRol() {
		return rRol.findAll();
	}
}
