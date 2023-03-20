package com.e_learning.GroupProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;
import static jakarta.persistence.TemporalType.TIMESTAMP;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy= IDENTITY)
    private int id_user;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "age")
    private int age;

    @Column(name="date_naissance_")
    private Date naissance;
    @Column(name = "email")
    private String email;

    private int telephone;
    @Column(name="pays")
    private String pays;
    @Column(name = "pseudo")
    private String pseudo;
    @Column(name = "password")
    private String password;




}
