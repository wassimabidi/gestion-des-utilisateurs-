package org.sid.controller;

import java.util.List;

import org.sid.models.Enseignant;
import org.sid.models.Etudiant;
import org.sid.models.Utilisateur;
import org.sid.respository.EnseignantRepository;
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
public class EnseignantController {
	@Autowired(required = false)
	EnseignantRepository enseignantRepository;
	@GetMapping("/enseignants")
	public List<Enseignant> getAllEnseignant()
	{
	  return  this.enseignantRepository.findAll();
	}
	@PostMapping("/enseignants")
	public Enseignant createEmploye(@RequestBody Enseignant enseignant)
	{
		return enseignantRepository.save(enseignant);
	}
	@GetMapping("/enseignants/{id}")
	public Enseignant getEtudiantypass(@PathVariable Long id)throws Exception{
		return this.enseignantRepository.findById(id).orElseThrow(()->new Exception("personne n'existe pas"));
	}
	@PutMapping("/enseignants/{id}")
	Enseignant UpdateorSaveEmploye(@RequestBody Enseignant enseignant ,@PathVariable Long id)throws Exception{
		return this.enseignantRepository.findById(id).map(x->{
			x.setNom(enseignant.getNom());
			x.setPrenom(enseignant.getPrenom());
			x.setPassword(enseignant.getPassword());
			x.setGrade(enseignant.getGrade());
			x.setEmail(enseignant.getEmail());
			x.setSpecialite(enseignant.getSpecialite());
		
			return enseignantRepository.save(enseignant);
		}).orElseThrow(()->new Exception("personne n'existe pas"));
	}

	@DeleteMapping("/enseignants/{id}")
	void deleteEnseignant(@PathVariable Long id) {
		 this.enseignantRepository.deleteById(id);
	}
	}
	

