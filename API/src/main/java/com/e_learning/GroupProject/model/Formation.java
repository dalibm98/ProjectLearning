package com.e_learning.GroupProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_form;
    private String titre;
    private String description;
    private String niveau;
    @Temporal(TemporalType.DATE)
    private Date date_creation;
    @Temporal(TemporalType.DATE)
    private Date date_formation;
    @Temporal(TemporalType.TIME)
    private Date heure_formation;
    @ManyToMany(mappedBy = "formations")
    protected Set<Formateur> formateurs=new HashSet<>();
   @ManyToMany
   @JoinTable(
           name = "Assister",
           joinColumns = { @JoinColumn(name = "formation_id") },
           inverseJoinColumns = { @JoinColumn(name = "etudiant_id") }
   )
    protected List<Etudiant> etudiants;

}
