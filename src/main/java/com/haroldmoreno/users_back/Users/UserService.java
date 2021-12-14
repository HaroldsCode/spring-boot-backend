package com.haroldmoreno.users_back.Users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public @ResponseBody List<usuario> getUsers() {
		return userRepository.findAll();
	}
	
	public @ResponseBody List<usuario> getSingleUsers(String nombre){
		return userRepository.findUsersByNamesContaining(nombre);
	}
	
	public @ResponseBody void createUser(@RequestBody usuario user) {
		Optional<usuario> usuarioExiste = userRepository.nameExist(user.getNombre());
		if(usuarioExiste.isPresent()) {
			throw new IllegalStateException("El usuario "+user.getNombre()+" ya existe");
		}
		userRepository.save(user);
	}
	
	@Transactional
	public void updateUser(Integer id_usuario, usuario user) {
		usuario usuarioModificador = userRepository.findById(id_usuario).orElseThrow(
			() -> new IllegalStateException("No se ha podido encontrar al usuario "+user.getNombre())
		);
		Optional<usuario> usuarioExiste = userRepository.canUpdateName(id_usuario, user.getNombre());
		if(usuarioExiste.isPresent()) {
			throw new IllegalStateException("El usuario "+user.getNombre()+" ya existe");
		}
		usuarioModificador.setNombre(user.getNombre());
		usuarioModificador.setRol(user.getRol());
		usuarioModificador.setActivo(user.getActivo());
	}
	
	public void deleteUser(Integer id_usuario) {
		userRepository.deleteById(id_usuario);
	}


}
