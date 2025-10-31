package entidades;

public class Materia {

    public Professor professor;
    public String conteudo;
    public String nomeDaMateria;
    public String atividade;

   public Materia(String data, double horario, Professor professor, String conteudo, String nomeDaMateria, String atividade){


        this.professor = professor;
        this.conteudo = conteudo;
        this.nomeDaMateria = nomeDaMateria;
        this.atividade = atividade;
    }



    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getNomeDaMateria() {
        return nomeDaMateria;
    }

    public void setNomeDaMateria(String nomeDaMateria) {
        this.nomeDaMateria = nomeDaMateria;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
}
