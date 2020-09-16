package entidades;

public class Disciplina {
	
	public String disciplina;
	public int nivelDisciplina;
	
	public Disciplina (String disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina(String disciplina, int nivelDisciplina) {
		this.disciplina = disciplina;
		this.nivelDisciplina = nivelDisciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getNivelDisciplina() {
		return nivelDisciplina;
	}

	public void setNivelDisciplina(int nivelDisciplina) {
		this.nivelDisciplina = nivelDisciplina;
	}

}
