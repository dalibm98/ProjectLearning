package com.e_learning.GroupProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.Normalizer;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enseigner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ensei;
    @ManyToOne
    @JoinColumn(name = "formateur_id")
    private Formateur formateur;
    @ManyToOne
    @JoinColumn(name = "formation_id")
    private Formation formation;
    @Column(name = "prix_enseigner")
    private float prix_enseigner;

}
