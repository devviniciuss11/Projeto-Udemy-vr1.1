public class aula extends curso {

    public String data;
    public double horario;
    public String professor;
    public String conteudo;
    public String descricao;
    public String atividades;

    public aula(){
        this.horario=19.30;
        this.data="20/05/2026";
        this.atividades="exercicios sobre sobrecarga de construtores!! ";
        this.professor="Rodrigo";
        this.conteudo="projeto em java";
        this.descricao="aula muito interresante que vai cair na prova";
    }
    public aula(Double horario){
        super();
        this.horario=horario;
    }
    public aula(Double horario,String data){
        super();
        this.horario=horario;
        this.data=data;
    }
    public aula(Double horario,String data, String professor) {
        super();
        this.horario = horario;
        this.data = data;
        this.professor=professor;
    }
    public aula(Double horario,String data, String atividades, String professor) {
        super();
        this.horario = horario;
        this.data = data;
        this.professor=professor;
        this.atividades=atividades;
    }
    public aula(Double horario,String data, String atividades, String professor, String conteudo) {
        super();
        this.horario = horario;
        this.data = data;
        this.professor=professor;
        this.atividades=atividades;
        this.conteudo=conteudo;
    }

    public aula(Double horario,String data, String atividades, String professor, String conteudo, String descricao) {
        super();
        this.horario = horario;
        this.data = data;
        this.professor=professor;
        this.atividades=atividades;
        this.conteudo=conteudo;
        this.descricao=descricao;
    }

    public String getdata(){
        return this.data;

    }
    public void setdata(String data){
        this.data = data;

    }
    public double gethorario(){
        return this.horario;

    }
    public void sethorario(double h){
        this.horario = h;

    }
    public String getprofessor(){
        return this.professor;

    }
    public void setprofessor(String p){
        this.professor = p;

    }
    public String getconteudo(){
        return this.conteudo;

    }
    public void setconteudo(String c){
        this.conteudo = c;

    }
    public String getdescricao(){
        return this.descricao;

    }
    public void setdescricao(String d){
        this.descricao = d;

    }
    public String getatividade(){
    return this.atividades;

    }
    public void setarividade(String x){
        this.atividades = x;

    }
    public void iniciarAula(){

    }
    public void encerrarAula(){

    }
    public void resumirAula(){

    }
    public void marcarConcluido(){

    }
    public void pausar(){

    }

}