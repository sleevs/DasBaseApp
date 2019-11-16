package br.com.unicarioca.databaseapp.model;

public class FeedbackModel {

	
	
	
	private Integer id ;
	private String descricao ;
	
	private Integer respostaId ;
	
	private Integer professotId ;
	
	
	
	public FeedbackModel() {
		
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

	public Integer getRespostaId() {
		return respostaId;
	}

	public void setRespostaId(Integer respostaId) {
		this.respostaId = respostaId;
	}

	public Integer getProfessotId() {
		return professotId;
	}

	public void setProfessotId(Integer professotId) {
		this.professotId = professotId;
	}
	
	
	
}
