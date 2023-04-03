package org.sid.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
 @Table(name="Utilisateurs")
//@Inheritance (strategy =InheritanceType.SINGLE_TABLE)
@Inheritance (strategy =InheritanceType.JOINED)
@DiscriminatorColumn (name ="TYPE_Utlisateurs" ,discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="UT")
public  class  Utilisateur {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
    private String email;
    private String password ;

}
