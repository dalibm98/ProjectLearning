package com.e_learning.GroupProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fichiers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_fichier;
    private String nom;
    private String description;
    private int taille;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_creation")
    private Date create_le ;
    @Column(name = "cree_Par")
    private String cree_par;
    @ManyToMany(mappedBy = "fichiers")
    protected List<Utilisateur> users;
}
