package com.senac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.domain.Aluno;
import com.senac.domain.Professor;
import com.senac.repository.ProfessorRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ProfessorService {

	@Autowired
	ProfessorRepository pfRepository;

	public List<Professor> listar() {
		return pfRepository.findAll();
	}

	public Professor salvar(Professor professor) {
		return pfRepository.save(professor);
	}

	public Professor buscaPorID(Integer id) throws ObjectNotFoundException {
		Optional<Professor> professor = pfRepository.findById(id);
		return professor.orElseThrow(() -> new ObjectNotFoundException("Professor não encontrado. id:" + id));
	}

	public Professor salvarAlteracao(Professor professorAlterado) throws ObjectNotFoundException {
		Professor professor = buscaPorID(professorAlterado.getId());
		professor.setNome(professorAlterado.getNome());
		professor.setId(professorAlterado.getId());
		return salvar(professor);
	}

	public void excluir(Integer id) {
		pfRepository.deleteById(id);
	}

}
