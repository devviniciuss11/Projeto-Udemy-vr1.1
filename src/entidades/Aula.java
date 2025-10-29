package entidades;

public class Aula  {

    public String data;
    public double horario;
    public Professor professor;
    public String conteudo;
    public String nomeAula;
    public String atividade;

   public Aula(String data, double horario, Professor professor,String conteudo,String nomeAula,String atividade){

        this.data = data;
        this.horario = horario;
        this.professor = professor;
        this.conteudo = conteudo;
        this.nomeAula = nomeAula;
        this.atividade = atividade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
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

    public String getNomeAula() {
        return nomeAula;
    }

    public void setNomeAula(String nomeAula) {
        this.nomeAula = nomeAula;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
}
