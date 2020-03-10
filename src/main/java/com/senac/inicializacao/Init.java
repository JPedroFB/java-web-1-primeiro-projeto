package com.senac.inicializacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.senac.domain.Aluno;
import com.senac.domain.Professor;
import com.senac.service.AlunoService;
import com.senac.service.ProfessorService;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	AlunoService alunoService;
	
	@Autowired
	ProfessorService professorService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		alunoService.salvar(new Aluno("Joao pedro"));
		alunoService.salvar(new Aluno("Ruan"));
		
//		//List<Aluno> listaAlunos = alunoService.listar();
//		
//		for(Aluno aluno : listaAlunos) {
//			System.out.println(aluno.getNome());
//		}
		
		Professor p1 = new Professor("Clayton");
		professorService.salvar(p1);
		
		Professor p2 = new Professor("Joaquim");
		professorService.salvar(p2);		
		
		
		
		
		
	}
	
	
	
}
