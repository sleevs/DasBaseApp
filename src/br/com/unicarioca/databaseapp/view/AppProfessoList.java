package br.com.unicarioca.databaseapp.view;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.unicarioca.databaseapp.dao.ProfessorDao;

public class AppProfessoList {

	public AppProfessoList() {
		// TODO Auto-generated constructor stub
	}

	public void main(String args[]) throws SQLException {

		System.out.println("BUSCAR FONTE DE DADOS");

		ProfessorDao p = new ProfessorDao();

		System.out.println(" DADOS OBTIDOS " + p.listar());

	}

}
