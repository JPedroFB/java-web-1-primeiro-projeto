package com.senac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senac.domain.Professor;


public interface ProfessorRepository extends JpaRepository<Professor, Integer>{

}
