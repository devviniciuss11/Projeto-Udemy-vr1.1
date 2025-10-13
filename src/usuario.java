public class usuario {
    // atributos comuns a todos os usuarios ------>
    private String id;
    public String nome;
    private String email;
    private String senha;
    public String tipoUsuario;

    //construtor padrao sem parametro --->
    public usuario(){
        this.id="vinicius2025";
        this.nome="nome e sobrenome";
        this.email="devpronto@gamil.com";
        this.senha="digitando...";
        this.tipoUsuario="professor,aluno,etc";

    }
   //construtor com parametros-->
    public usuario(String nome){
        this.nome=nome;
    }
    public usuario(String nome,String email){
        this.nome=nome;
        this.email=email;
    }
    public usuario(String nome,String email, String senha){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
    }

    public usuario(String nome,String email, String senha, String tipoUsuario){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
        this.tipoUsuario=tipoUsuario;
    }
    public usuario(String nome,String email, String senha, String tipoUsuario,String id){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
        this.tipoUsuario=tipoUsuario;
        this.id=id;
    }
//    get e set
    public String getnome(){

        return this.nome;
    }
    public void setnome(String n){
        this.nome = nome;

    }

    public String getid(){
        return this.id;

    }
    public void setid(int i){
            this.id = id;

    }
    public String getemail(){
        return this.email;

    }
    public void setemail(String e){
        this.email = email;

    }
    public String getsenha(){
        return this.senha;

    }
    public void setsenha(String s){
        this.senha = senha;

    }
    public String getTipoUsuario(){
        return this.tipoUsuario;

    }
    public void setTipoUsuario(String t){
        this.tipoUsuario = tipoUsuario;

    }
    public void status() {

    }

    public void login(){

    }
    public void logout(){

    }
    public void exibir() {
        System.out.println("seu id : " + id);
        System.out.println("olá, Seja bem-vindo(a): " + nome);
        System.out.println("Cargo:" + tipoUsuario);
        }

}