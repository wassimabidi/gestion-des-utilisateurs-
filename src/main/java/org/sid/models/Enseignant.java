package org.sid.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DiscriminatorValue(value="EN")
public class Enseignant extends Utilisateur  {
 private String grade ;
 private String specialite;
}
