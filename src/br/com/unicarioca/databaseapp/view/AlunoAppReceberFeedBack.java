package br.com.unicarioca.databaseapp.view;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.unicarioca.databaseapp.dao.AlunoDao;

public class AlunoAppReceberFeedBack {

	
	
	
	public static void main() throws SQLException {
		
     System.out.println("INFORME O ID DO ALUNO PARA RECEBER O FEEDBACK");

		System.out.println("INFORME : O ID DO ALUNO");
		 Scanner idAluno = new Scanner(System.in);
		 		 
		 int idaluno = idAluno.nextInt();
		AlunoDao aluno = new AlunoDao();
		
		System.out.println("DESCRICAÇÃO DO  O FEEDBACK");
		System.out.println(aluno.meusFeedBack(idaluno));
	
	

	
	}

}
