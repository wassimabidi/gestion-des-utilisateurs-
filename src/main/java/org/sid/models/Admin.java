package org.sid.models;

import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue(value="AD")
public class Admin  extends Utilisateur{

}
