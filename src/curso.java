public class curso {

    public String nomeCurso;
    public String descricaoCurso;
    public String cargaHoraria;
    public double preco;
    public String alunosMatriculados;
    private String avaliacao;

    public curso(){
    this.nomeCurso="ciencia da computacao";
    this.descricaoCurso="muito bom interessante";
    this.cargaHoraria="200HR";
    this.preco=2700.99;
    this.alunosMatriculados="300";
    this.avaliacao="(projeto + prova)/2";
    }
    public curso(String nomeCurso){
        this.nomeCurso=nomeCurso;

    }
    public curso(String nomeCurso, String descricaoCurso){
        this.nomeCurso=nomeCurso;
        this.descricaoCurso=descricaoCurso;

    }
    public curso(String nomeCurso, String descricaoCurso, String cargaHoraria) {
        this.nomeCurso=nomeCurso;
        this.descricaoCurso=descricaoCurso;
        this.cargaHoraria=cargaHoraria;
    }
    public curso(String nomeCurso, String descricaoCurso, String cargaHoraria, Double preco) {
        this.nomeCurso=nomeCurso;
        this.descricaoCurso=descricaoCurso;
        this.cargaHoraria=cargaHoraria;
        this.preco=preco;
    }
    public curso(String nomeCurso, String descricaoCurso, String cargaHoraria, Double preco, String alunosMatriculados) {
        this.nomeCurso=nomeCurso;
        this.descricaoCurso=descricaoCurso;
        this.cargaHoraria=cargaHoraria;
        this.preco=preco;
        this.alunosMatriculados=alunosMatriculados;
    }
    public curso(String nomeCurso, String descricaoCurso, String cargaHoraria, Double preco, String alunosMatriculados, String avaliacao) {
        this.nomeCurso=nomeCurso;
        this.descricaoCurso=descricaoCurso;
        this.cargaHoraria=cargaHoraria;
        this.preco=preco;
        this.alunosMatriculados=alunosMatriculados;
        this.avaliacao=avaliacao;
    }

    public String getnomeCurso(){
        return this.nomeCurso;

    }
    public void setnomeCurso(String c){
        this.nomeCurso = c;

    }
    public String getdescricaoCurso(){
        return this.descricaoCurso;

    }
    public void setdescricaoCurso(String d){
        this.descricaoCurso = d;

    }
    public String getcargaHoraria(){
        return this.cargaHoraria;

    }
    public void setcargaHoraria(String a){
        this.cargaHoraria = a;

    }
    public double getpreco(){
        return this.preco;

    }
    public void setpreco(double p){
        this.preco = p;

    }
    public String getalunosMatriculados(){
        return this.alunosMatriculados;

    }
    public void setalunosMatriculados(String z){
        this.alunosMatriculados = z;

    }
    public String getavaliacao(){
        return this.avaliacao;

    }
    public void setavaliacao(String x){
        this.avaliacao = x;

    }
    public void progressoCurso(){

    }
    public void inscreverCurso(){

    }
    public void disciplinas(){

    }
    public void modulos(){

    }
    public void materiaisComplementares(){

    }
}