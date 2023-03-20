package com.e_learning.GroupProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Assister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idassister;
    @ManyToOne
    @JoinColumn(name = "formation_id")
    Formation formation;
    @ManyToOne
    @JoinColumn(name = "etudiant_id")
    Etudiant etudiant;
    @Column(name = "prix_assister")
    private float prix_assister;

}
