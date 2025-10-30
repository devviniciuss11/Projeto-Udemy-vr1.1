package Servico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import entidades.Aluno;
import entidades.Curso;
import gui.MenuAluno;
import interfacess.Teste;
import Repositorio.AlunoRepositorio;
import Repositorio.CursoRepositorio;
public class AlunoServico {
    PagamentoServico pagamentoServico = new PagamentoServico();
    AlunoRepositorio repositorioaluno = new AlunoRepositorio();
    Teste teste01 = new Teste();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    MenuAluno menuAluno = new MenuAluno();

    public void cadastrar(Scanner inputaluno) {
        System.out.println("Digite o nome do Aluno: ");
        String nome = inputaluno.nextLine();
        while (true) {
            System.out.println("Digite o CPF do Aluno: ");
            String cpf = inputaluno.nextLine();
            System.out.println("Digite o email do Aluno: ");
            String email = inputaluno.nextLine();
            System.out.println("Digite a senha para o cadastro do Aluno: ");
            String senha = inputaluno.nextLine();

            if (!verificarCadastro(cpf , email)){
                System.out.println("Digite a Data de Nascimento do Aluno (formato dd/MM/yyyy): ");
                String dataNasimento = inputaluno.nextLine();
                try {
                    Date dataNascimento = dateFormat.parse(dataNasimento);
                    if (idadeUsuario(dataNascimento) < 12) {
                        System.out.println("Cliente menor de idade.Tente novamente!");
                        break;
                    }
                    Aluno aluno = new Aluno(nome,cpf,dataNasimento, email, senha);
                    this.repositorioaluno.salvar(aluno);
                    aluno.email();
                    aluno.senha();
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    teste01.adicionando01();
                    menuAluno.menuAluno(aluno, inputaluno);
                    break;
                } catch (ParseException e) {
                    System.out.println("Formato de data inválido. Tente novamente.");
                }
            }
        }
    }

    public void login(Scanner sc) {
        System.out.println("Digite o email do Aluno: ");
        String email = sc.nextLine();
        System.out.println("Digite o senha do Aluno: ");
        String senha = sc.nextLine();
        Aluno aluno = repositorioaluno.loginAluno(email, senha);
        if (aluno != null) {
            menuAluno.menuAluno(aluno, sc);
        }else {
            System.out.println("Email ou senha incorretas");
        }

    }
    private boolean verificarCadastro(String cpf, String email) {

        if (repositorioaluno.verificarAlunoPorEmail(email)) {
            System.out.println("Este e-mail já foi cadastrado. Tente novamente.");
            return true;
        }
        if (repositorioaluno.verificarAlunoPorCpf(cpf)){
            System.out.println("este CPF ja foi cadastrado. Tente Novamente.");
        }
        return false;
    }

    private int idadeUsuario(Date dataNascimento) {
        Calendar dataNascimentoCal = Calendar.getInstance();
        dataNascimentoCal.setTime(dataNascimento);
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - dataNascimentoCal.get(Calendar.YEAR);

        if (hoje.get(Calendar.DAY_OF_YEAR) < dataNascimentoCal.get(Calendar.DAY_OF_YEAR)) {
            idade--;
        }

        return idade;
    }



    public void comprar(Scanner sc,Aluno aluno) {
        System.out.println("Lista de cursos Disponiveis: :");
        CursoRepositorio.mostrarCurso();
        System.out.println("Digite qual deseja comprar: ");
        String nome = sc.nextLine();
        Curso curso = CursoRepositorio.verificarCursoPorNome(nome);
        boolean pagamentoAprovado = pagamentoServico.metodoDePagamento(curso.getValorDoCurso());
        if (pagamentoAprovado == true){
            aluno.setCursos(curso);

            System.out.println("Novo curso adquirido");
            //CursoRepositorio.mostrarCursoDoaluno();
        }

        }

    public void vercursosadquiridos(Aluno aluno){
        ArrayList<Curso> cursosDoAluno = aluno.getCursos();
        if (cursosDoAluno.isEmpty()) {
            System.out.println("Você ainda não adquiriu nenhum curso.");
        } else {
            System.out.println("--- Seus Cursos Adquiridos ---");
            for (Curso curso : cursosDoAluno) {
                System.out.println("- " + curso.getCursoNome());
            }
            System.out.println("------------------------------");
        }
    }

    public void removerCursoAdquirido(Scanner sc, Aluno aluno) {
        vercursosadquiridos(aluno);
        ArrayList<Curso> cursosDoAluno = aluno.getCursos();

        if (cursosDoAluno.isEmpty()) {
            return; // Sai do método se não houver cursos para remover
        }

        System.out.println("Digite o nome do curso que deseja remover:");
        String nomeCursoParaRemover = sc.nextLine();

        Curso cursoParaRemover = null;
        for (Curso curso : cursosDoAluno) {
            if (curso.getCursoNome().equalsIgnoreCase(nomeCursoParaRemover)) {
                cursoParaRemover = curso;
                break;
            }
        }

        if (cursoParaRemover != null) {
            aluno.excluirCurso(cursoParaRemover);
            System.out.println("Curso \"" + nomeCursoParaRemover + "\" removido com sucesso!");
        } else {
            System.out.println("Curso não encontrado na sua lista.");
        }
    }


}
