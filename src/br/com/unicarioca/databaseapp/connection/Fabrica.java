package br.com.unicarioca.databaseapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/*
 * autor: JEISON MUNIZ
 * background: APS
 * escopo: fabrica de conexões
 * cenario:
 * dado:
 * 
 * */
public class Fabrica {

   private String servidor , porta  , login , senha , db ;
	
	public Fabrica() {
		this.servidor= "127.0.0.1";
		this.porta= "3306";
		this.login= "root";
		this.senha= "maximus";
		this.db= "aps";
	}
	

	
	public Connection conexao () throws SQLException {

		Connection c =	DriverManager.getConnection("jdbc:mysql//"+getServidor()+":"+getPorta()+"/"+ getDb(), getLogin(), getSenha()) ;

		System.out.println(c);
		return c ;
	}



	public String getServidor() {
		return servidor;
	}



	public void setServidor(String servidor) {
		this.servidor = servidor;
	}



	public String getPorta() {
		return porta;
	}



	public void setPorta(String porta) {
		this.porta = porta;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getDb() {
		return db;
	}



	public void setDb(String db) {
		this.db = db;
	}
	
	
	
	
}
