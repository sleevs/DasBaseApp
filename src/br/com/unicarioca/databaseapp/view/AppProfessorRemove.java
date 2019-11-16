package br.com.unicarioca.databaseapp.view;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.unicarioca.databaseapp.dao.ProfessorDao;
import br.com.unicarioca.databaseapp.model.ProfessorModel;

public class AppProfessorRemove {

	public AppProfessorRemove() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void main(String args[]) throws SQLException {

		System.out.println("REMOVER DADOS");

		System.out.println("INFORM O ID A SER REMOVIDO");
		Scanner id = new Scanner(System.in);

		int temp = id.nextInt();

		ProfessorDao p = new ProfessorDao();

		
		Integer retorno = p.remover(temp);
		System.out.println(" LINHAS INSERIDOS " + retorno);

	}

}
