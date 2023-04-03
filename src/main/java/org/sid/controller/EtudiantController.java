package org.sid.controller;



import java.util.List;


import org.sid.models.Etudiant;
import org.sid.respository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EtudiantController {
	@Autowired(required = false)
	EtudiantRepository etudiantRepository;
	@GetMapping("/etudiants")
	public List<Etudiant>getAllEtudiant()
	{
	  return  this.etudiantRepository.findAll();
	}
	@GetMapping("/etudiants/{id}")
	public Etudiant findByideee(@PathVariable Long id)throws Exception{
		return this.etudiantRepository.findById(id).orElseThrow(()->new Exception("personne n'existe pas"));
	}
	@PostMapping("/etudiants")
	public Etudiant createEmploye(@RequestBody Etudiant etudiant)
	{
		return etudiantRepository.save(etudiant);
	}
	@PutMapping("/etudiants/{id}")
	Etudiant UpdateorSaveEmploye(@RequestBody Etudiant etudiant ,@PathVariable Long id)throws Exception{
		return this.etudiantRepository.findById(id).map(x->{
			x.setNom(etudiant.getNom());
			x.setPrenom(etudiant.getPrenom());
			x.setPassword(etudiant.getPassword());
			x.setNiveau_etude(etudiant.getNiveau_etude());
			x.setEmail(etudiant.getEmail());
			x.setDiplome(etudiant.getDiplome());
		
			return etudiantRepository.save(etudiant);
		}).orElseThrow(()->new Exception("personne n'existe pas"));
	}

	@DeleteMapping("/etudiants/{id}")
	void deleteEnseignant(@PathVariable Long id) {
		 this.etudiantRepository.deleteById(id);
	}
}
