package br.com.unicarioca.databaseapp.view;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.unicarioca.databaseapp.dao.AlunoDao;

/*
 * autor: JEISON MUNIZ
 * background: APS
 * escopo: acesso a entrada e resposta para o aluno
 * cenario:
 * dado:
 * 
 * */



public class AppAlunoResponderPergunta {

	public AppAlunoResponderPergunta() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main()throws SQLException {
		
		System.out.println("RESPONDER PERGUNTA");
		
		AlunoDao aluno = new AlunoDao();
		
		System.out.println("INFORME : O ID ALUNO");
		 Scanner idAluno = new Scanner(System.in);
		 int idaluno = idAluno.nextInt();
		 
		System.out.println("INFORME : O ID DA PERGUNTA");
		 Scanner idPergunta = new Scanner(System.in);
		 int idpergunta = idPergunta.nextInt();
		System.out.println("INFORME : INFORME A RESPOSTA ");
		 Scanner descricaoResposta = new Scanner(System.in);
		 String  des = descricaoResposta.next();
		 
		aluno.responderPergunta(des, idaluno, idpergunta);
		System.out.println();
	}
	


}
