public class aluno extends usuario{

    public String nome;
    public String cursoInscrito;
    public String etapa;
    private int matricula;
    private int idade;
    public String turma;
public aluno(){
    this.nome="garibaldo";
    this.cursoInscrito="curso de java";
    this.matricula=20251230;
    this.idade=19;
    this.turma="6p(A)";
    this.etapa="111";
}
    //construtor com parametros --->>>
public aluno(String nome){
    super(nome);
    this.nome=nome;
}
    public aluno(String nome, String cursoInscrito){
        super(nome);
        this.nome=nome;
        this.cursoInscrito=cursoInscrito;
    }
    public aluno(String nome, String cursoInscrito, int matricula){
        super(nome);
        this.nome=nome;
        this.cursoInscrito=cursoInscrito;
        this.matricula=matricula;
    }
    public aluno(String nome, String cursoInscrito, int matricula, int idade){
        super(nome);
        this.nome=nome;
        this.cursoInscrito=cursoInscrito;
        this.matricula=matricula;
        this.idade=idade;
    }


    //construtor com parametros --->>>
    public aluno(String nome, String cursoInscrito, int matricula, int idade, String turma){
        this.nome=nome;
        this.cursoInscrito=cursoInscrito;
        this.matricula=matricula;
        this.idade=idade;
        this.turma=turma;
    }
    //construtor com parametros --->>>
    public aluno(String nome, String cursoInscrito, int matricula, int idade, String turma,String etapa){
        this.nome=nome;
        this.cursoInscrito=cursoInscrito;
        this.matricula=matricula;
        this.idade=idade;
        this.turma=turma;
        this.etapa=etapa;
    }

    public String getnome(){
        return this.nome;

    }
    public void setnome(String nome){
        this.nome = nome;

    }
    public String getCursoInscrito(){
        return this.cursoInscrito;

    }
    public void setcursoInscrito(String cursoInscrito){
        this.cursoInscrito = cursoInscrito;

    }
    public String getEtapa(){
        return this.etapa;

    }
    public void setEtapa(String etapa){
        this.etapa = etapa;

    }
    public int getmatricula(){
        return this.matricula;

    }
    public void setmatricula(int matricula){
        this.matricula = matricula;

    }
    public int getidade(){
        return this.idade;

    }
    public void setidade(int idade){
        this.idade = idade;

    }
    public String getturma(){
        return this.turma;

    }
    public void setturma(String turma){
        this.turma = turma;

    }
    public void visualizarNota(){

    }
    public void verFrequencia(){

    }
    public void assistirAula(){

    }
    public void enviarAtividade(){

    }
    public void chat(){

    }
}