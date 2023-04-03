package org.sid.respository;

import org.sid.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

@EnableJpaRepositories
public interface UserRepository  extends JpaRepository<Utilisateur,Long>{
	@Query("SELECT e FROM Utilisateur e WHERE e.email =:email AND e.password =:password ")
	Utilisateur findbyName(@Param("email") String email,@Param("password") String password);

}
