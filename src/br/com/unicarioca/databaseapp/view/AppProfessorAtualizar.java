package br.com.unicarioca.databaseapp.view;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.unicarioca.databaseapp.dao.AlunoDao;
import br.com.unicarioca.databaseapp.dao.ProfessorDao;

public class AppProfessorAtualizar {

	public AppProfessorAtualizar() {
		
	}
	
	public void main(String args[]) 
			throws SQLException {
		
		
			System.out.println("Atualizar dados");
			System.out.println("informe os dados");
			 Scanner dados = new Scanner(System.in);
			 String a = dados.next();
				ProfessorDao p = new ProfessorDao();
				
				
				System.out.println(" RESULTADO DA ATUALIZAÇÃO "+ p.atualizar(a));
		
	}

}
