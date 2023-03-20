package com.e_learning.GroupProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant extends Utilisateur{
    @Column(name = "niveau")
    private String niveau;
    @Column(name = "diplome")
    private String diplome;
    @ManyToMany(mappedBy = "etudiants")
    protected Set<Formation> formations=new HashSet<>();

}
