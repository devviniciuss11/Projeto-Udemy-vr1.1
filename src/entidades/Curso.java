package entidades;

public class Curso {

    private String cursoNome;
    private String cursoDescricao;
    private String cargaHoraria;
    private String valorDoCurso;

    public Curso(String cursoNome, String cursoDescricao, String cargaHoraria, String valorDoCurso){
        this.cursoNome = cursoNome;
        this.cargaHoraria= cargaHoraria;
        this.valorDoCurso = valorDoCurso;
        this.cursoDescricao= cursoDescricao;
    }


    public String getCursoNome(){
        return this.cursoNome;

    }
    public void setCursoNome(String cursoNome){
        this.cursoNome = cursoNome;

    }

    public String getCursoDescricao() {
        return cursoDescricao;
    }
    public void setCursoDescricao(String cursoDescricao) {
        this.cursoDescricao = cursoDescricao;
    }

    public String getcargaHoraria(){
        return this.cargaHoraria;

    }
    public void setcargaHoraria(String cargaHoraria){
        this.cargaHoraria = cargaHoraria;

    }
    public String getValorDoCurso(){
        return valorDoCurso;

    }
    public void setValorDoCurso(String ValorDoCurso){
        this.valorDoCurso = ValorDoCurso;

    }
}