package com.e_learning.GroupProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reclam;
    @Column(name = "objet")
    private String objet;
    @Column(name = "message")
    private String message;
    @ManyToMany(mappedBy = "reclamations")
    protected List<Utilisateur> users;

}
