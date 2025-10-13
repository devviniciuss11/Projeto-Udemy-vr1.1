public class professor  extends usuario {

    public String nome;
    public String biografia;
    public String qualificacoes;
    public String email;
    public String cursoQueLeciona;
    private String salario;

    public professor(){
        this.nome="vinicius";
        this.biografia="nasci em 1983 sou muito bom no que faco e vou tirar 10 em programacao";
        this.qualificacoes="sou cientista da computacao";
        this.email="melhor11@gamil.com";
        this.cursoQueLeciona="sistemas de informacao";
        this.salario="30000";

    }
    public professor(String nome){
        super(nome);
        this.nome=nome;
    }
    public professor(String nome, String biografia){
        super(nome);
        this.nome=nome;
        this.biografia=biografia;
    }
    public professor(String nome, String biografia, String qualificacoes){
        super(nome);
        this.nome=nome;
        this.biografia=biografia;
        this.qualificacoes=qualificacoes;
    }

    public professor(String nome, String biografia, String qualificacoes, String email, String cursoQueLeciona){
        super(nome);
        this.nome=nome;
        this.biografia=biografia;
        this.qualificacoes=qualificacoes;
        this.email=email;
        this.cursoQueLeciona=cursoQueLeciona;
    }

    public professor(String nome, String biografia, String qualificacoes, String email, String cursoQueLeciona, String salario){
        super(nome);
        this.nome=nome;
        this.biografia=biografia;
        this.qualificacoes=qualificacoes;
        this.email=email;
        this.cursoQueLeciona=cursoQueLeciona;
        this.salario=salario;
    }

    public String getnome(){
        return this.nome;

    }
    public void setnome(String n){
        this.nome = nome;

    }
    public String getbiografia(){
        return this.biografia;

    }
    public void setbiografia(String b){
        this.biografia = biografia;

    }
    public String getqualificacoes(){
        return this.qualificacoes;

    }
    public void setqualificacoes(String q){
        this.qualificacoes = qualificacoes;

    }
    public String getemail(){
        return this.email;

    }
    public void setemail(String e){
        this.email = email;

    }
    public String getcursoQueLeciona(){
        return this.cursoQueLeciona;

    }
    public void setcursoQueLeciona(String c){
        this.cursoQueLeciona = cursoQueLeciona;

    }
    public String getsalario(){
        return this.salario;

    }
    public void setsalario(String s){
        this.salario = salario;

    }
    public void ensinar(){

    }
    public void presenca(){

    }
    public void atribuirNota(){

    }
    public void criarAtividade(){

    }
    public void atualizarCurso(){

    }

}