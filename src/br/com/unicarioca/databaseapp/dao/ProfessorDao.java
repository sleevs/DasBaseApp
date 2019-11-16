package br.com.unicarioca.databaseapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.com.unicarioca.databaseapp.connection.Fabrica;
import br.com.unicarioca.databaseapp.model.PerguntaModel;
import br.com.unicarioca.databaseapp.model.ProfessorModel;

public class ProfessorDao{

	
	Connection banco ;
	
	
	public ProfessorDao() throws SQLException {

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
	
	
	public int insert(ProfessorModel t) throws SQLException {
	
	String  sql = "INSERT INTO `aps`.`professor` (`professor_disciplina`, `professor_nome`) VALUES ('?', '?')";	
		
     PreparedStatement stm = (PreparedStatement) banco.prepareStatement(sql);
	
     stm.setString(1, t.getNome());

     stm.setString(2, t.getDisciplina());
     
     return stm.executeUpdate();
	}

	
	public int remover(Integer t) throws SQLException {
		// DELETE FROM table_name WHERE condition;
		String  sql = "DELETE FROM professor WHERE WHERE  professor_id =?";	
		  PreparedStatement stm = (PreparedStatement) banco.prepareStatement(sql);
			
		  stm.setInt(1, t );
		     
		     return stm.executeUpdate();
	}

	
	public int atualizar(String t) throws SQLException {
		String  sql = "UPDATE professor SET  professor_disciplina=?  WHERE  professor_id =?";	
		
	     PreparedStatement stm = (PreparedStatement) banco.prepareStatement(sql);
		

	     stm.setString(1, t);
	     
	     return stm.executeUpdate();
	}

	
	public List<ProfessorModel> listar() throws SQLException {
		String  sql = "SELECT * FROM professor";	
		
	     PreparedStatement stm = (PreparedStatement) banco.prepareStatement(sql);
	     List<ProfessorModel> lista = new ArrayList<>();
	     ResultSet resultado  = stm.executeQuery() ;
	     
	     ProfessorModel p = new  ProfessorModel();
	     while(resultado.next()){
	    	 p.setId(resultado.getInt("professor_id"));
	    	 p.setDisciplina(resultado.getString("professor_disciplina"));
	    	 p.setNome(resultado.getString("professor_nome"));
	    	 lista.add(p);
	     }
	     
	     return lista;
		
	}


}
