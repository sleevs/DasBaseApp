package br.com.unicarioca.databaseapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.unicarioca.databaseapp.connection.Fabrica;
import br.com.unicarioca.databaseapp.model.FeedbackModel;


public class AlunoDao {

	Connection banco ;
	


	public AlunoDao() throws SQLException {

		Fabrica fabrica = new Fabrica();
		banco = (Connection) fabrica.conexao();
	}

	public void finalizar() throws Throwable {

		try {
			banco.close();
		} finally {
			super.finalize();

		}

	}
	 
	/*
	 * autor: jeisom muniz 
	 * background:
	 *  escopo: aluno
	 * cenario: Para o usuário aluno, apos
	 * receber o identificador do questionário permitira responder as questoess do
	 * questionário
	 */
	
	 public int responderPergunta( String descricaoResposta , Integer idAluno , Integer idPergunta) throws SQLException {
			
		 String SQL = "INSERT INTO `aps`.`resposta` (`resposta_descricao`, `aluno_aluno_id`, `pergunta_pergunta_id`) VALUES (?, ?, ?)";
		 
		 PreparedStatement stm = (PreparedStatement) banco.prepareStatement(SQL);
			
	     stm.setString(1, descricaoResposta);

	     stm.setInt(2, idAluno);
	     stm.setInt(3, idPergunta);
	     
	     return stm.executeUpdate();
			 
			 
		}
	 
	 
	 /*
	  * autor:jeison muniz
	  * background
	  * escopo: aluno
	  * cenario:  apresentados ao usuário cliente, também deverá conter
	  *   o feedback de cada opção, certa ou errada e o grau de dificuldade das questões
	  * */


	public List<FeedbackModel> meusFeedBack(Integer a) throws SQLException {

		String SQL = "select * from feedback \r\n" + "join resposta \r\n" + "on resposta_resposta_id = resposta_id \r\n"
				+ "where aluno_aluno_id =?";

		PreparedStatement stm = (PreparedStatement) banco.prepareStatement(SQL);

		stm.setInt(1, a);

		List<FeedbackModel> lista = new ArrayList<>();
		ResultSet resultado = stm.executeQuery();

		FeedbackModel f = new FeedbackModel();
		while (resultado.next()) {

			f.setId(resultado.getInt("feedback_id"));
			f.setDescricao(resultado.getString("feedback_descricao"));
			f.setProfessotId(resultado.getInt("professor_professor_id"));
			f.setRespostaId(resultado.getInt("resposta_resposta_id"));

			lista.add(f);
		}

		return lista;

	}
	
	

	
	


}
