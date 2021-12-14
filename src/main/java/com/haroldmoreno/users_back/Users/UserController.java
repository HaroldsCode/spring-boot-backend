package com.haroldmoreno.users_back.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	private final UserService sUser;
	
	@Autowired
	public UserController(UserService sUser) {
		this.sUser = sUser;
	}
	
	@GetMapping(path="{nombre}")
	public List<usuario> getSingleUsers( @PathVariable String nombre ) {
		return sUser.getSingleUsers(nombre);
	}

	@GetMapping
	public List<usuario> getUsers() {
		return sUser.getUsers();
	}
	
	@PostMapping
	public void createUser(@RequestBody usuario user) {
		sUser.createUser(user);
	}
	
	@PutMapping(path="{id_usuario}")
	public void updateUser (@PathVariable Integer id_usuario, @RequestBody usuario user) {
		sUser.updateUser(id_usuario, user);
	}
	
	@DeleteMapping(path="{id_usuario}")
	public void deleteUser( @PathVariable Integer id_usuario ) {
		sUser.deleteUser(id_usuario);
	}
	
}
