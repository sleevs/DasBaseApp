package br.com.unicarioca.databaseapp.model;

public class QuestionarioModel {

	
	private Integer id ;
	private String descricao ;
	
	
	public QuestionarioModel() {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "QuestionarioModel [id=" + id + ", descricao=" + descricao + ", getId()=" + getId() + ", getDescricao()="
				+ getDescricao() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

	
	
	
}
