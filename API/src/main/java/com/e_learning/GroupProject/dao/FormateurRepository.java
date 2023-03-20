package com.e_learning.GroupProject.dao;

import com.e_learning.GroupProject.model.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FormateurRepository extends JpaRepository<Formateur,Integer> {
}
