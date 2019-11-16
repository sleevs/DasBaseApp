package br.com.unicarioca.databaseapp.view;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.unicarioca.databaseapp.dao.ProfessorDao;
import br.com.unicarioca.databaseapp.model.ProfessorModel;

public class AppProfessorInsert {

	public AppProfessorInsert() {
		// TODO Auto-generated constructor stub
	}

	public void main(String args[]) throws SQLException {

		System.out.println("INSERIR DADOS");

		System.out.println("INFORM O SEU NOME");
		Scanner nome = new Scanner(System.in);

		String nomeProfessor = nome.next();
		System.out.println("INFORM O SUA DISCIPLINA");
		Scanner disciplina = new Scanner(System.in);

		String disciplinaProfessor = disciplina.next();

		ProfessorDao p = new ProfessorDao();
		ProfessorModel professor = new ProfessorModel();
		professor.setNome(nomeProfessor);
		professor.setDisciplina(disciplinaProfessor);
		Integer retorno = p.insert(professor);
		System.out.println(" LINHAS INSERIDOS " + retorno);

	}

}


