package br.com.unicarioca.databaseapp.model;

public class RespostaModel {


	private Integer id ;
	private String descricao ;
	private Integer perguntaId ;
	private Integer alunoId ;
	
	
	public RespostaModel() {
		
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


	public Integer getPerguntaId() {
		return perguntaId;
	}


	public void setPerguntaId(Integer perguntaId) {
		this.perguntaId = perguntaId;
	}


	public Integer getAlunoId() {
		return alunoId;
	}


	public void setAlunoId(Integer alunoId) {
		this.alunoId = alunoId;
	}


	@Override
	public String toString() {
		return "RespostaModel [id=" + id + ", descricao=" + descricao + ", perguntaId=" + perguntaId + ", alunoId="
				+ alunoId + ", getId()=" + getId() + ", getDescricao()=" + getDescricao() + ", getPerguntaId()="
				+ getPerguntaId() + ", getAlunoId()=" + getAlunoId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
