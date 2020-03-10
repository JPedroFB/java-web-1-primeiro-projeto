package com.senac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.domain.Aluno;
import com.senac.domain.Professor;
import com.senac.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	ProfessorRepository pfRepository;

	public List<Professor> listar(Professor p1) {
		return pfRepository.findAll();
	}
	
	public Professor salvar(Professor professor) {
		return pfRepository.save(professor);
	}
	
}
