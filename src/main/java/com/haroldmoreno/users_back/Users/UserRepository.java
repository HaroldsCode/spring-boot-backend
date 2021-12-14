package com.haroldmoreno.users_back.Users;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<usuario, Integer>{
	@Query(value="Select * from usuario where nombre like %:name%", nativeQuery=true)
	List<usuario> findUsersByNamesContaining(@Param("name") String nombre);
	
	@Query(value="Select * from usuario where nombre = :name", nativeQuery=true)
	Optional<usuario> nameExist(@Param("name") String nombre);
	
	@Query(value="Select * from usuario where nombre = :name and id_usuario != :id", nativeQuery=true)
	Optional<usuario> canUpdateName(@Param("id") Integer id_usuario, @Param("name") String nombre);
}
