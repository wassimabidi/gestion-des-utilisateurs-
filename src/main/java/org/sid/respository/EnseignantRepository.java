package org.sid.respository;

import org.apache.catalina.User;
import org.sid.models.Enseignant;
import org.sid.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {
	/*@Query("SELECT u FROM Utilisateur WHERE u.email=:email AND u.password=:password")
    User findByUsernameOrEmail(String email,String password);*/

}
