package org.sid.respository;


import org.sid.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository 
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>{

}
