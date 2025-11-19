package entidades;



public class Professor extends Usuario {

    private String qualificacoes;
    private String curso;



    public Professor(String nome, String cpf,  String dataNascimento, String email,  String senha, String qualificacoes) {
        super(nome, cpf, dataNascimento, email, senha);
        this.qualificacoes = qualificacoes;

    }
    public Professor() {
        super();
    }

    public Professor(String nome, String email) {
        super(nome, email);
    }


    @Override
    public void senha() {
        System.out.println("Sua Senha pra Realizar o Login: "+ getSenha());
    }
    @Override
    public void email() {
        System.out.println("Seu Email Pra Realizar o Login: "+ getEmail());
    }


    public String getQualificacoes() {
        return qualificacoes;
    }

    public void setQualificacoes(String qualificacoes) {
        this.qualificacoes = qualificacoes;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }



}