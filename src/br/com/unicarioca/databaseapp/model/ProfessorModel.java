package br.com.unicarioca.databaseapp.model;

public class ProfessorModel {

	
	
	private Integer id ;
	private String nome ;
	private String disciplina ;
	
	
	public ProfessorModel() {
		
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

	public String getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	@Override
	public String toString() {
		return "ProfessorModel [id=" + id + ", nome=" + nome + ", disciplina=" + disciplina + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
