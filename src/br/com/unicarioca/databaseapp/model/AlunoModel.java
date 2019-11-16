package br.com.unicarioca.databaseapp.model;

public class AlunoModel {

	private Integer id ;
	private String nome ;
	
	
	
	public AlunoModel() {
	
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "AlunoModel [id=" + id + ", nome=" + nome + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

	
	
	
	
}
