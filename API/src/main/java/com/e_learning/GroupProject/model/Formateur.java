package com.e_learning.GroupProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Formateur extends Utilisateur {
    @Column(name = "grade")
    private String grade;
    @Column(name = "specialite")
    private String specialite;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Enseigner",
            joinColumns = { @JoinColumn(name = "formateur_id") },
            inverseJoinColumns = { @JoinColumn(name = "formation_id") }
    )
    protected List<Formation> formations;

}
