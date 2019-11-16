package br.com.unicarioca.databaseapp.model;

public class PerguntaModel {

	
	
	private Integer id ;
	private String descricao ;
	private Integer questionarioId ;
	
	
	
	public PerguntaModel() {
		
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
	public Integer getQuestionarioId() {
		return questionarioId;
	}
	public void setQuestionarioId(Integer questionarioId) {
		this.questionarioId = questionarioId;
	}




	@Override
	public String toString() {
		return "PerguntaModel [id=" + id + ", descricao=" + descricao + ", questionarioId=" + questionarioId
				+ ", getId()=" + getId() + ", getDescricao()=" + getDescricao() + ", getQuestionarioId()="
				+ getQuestionarioId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	

}
