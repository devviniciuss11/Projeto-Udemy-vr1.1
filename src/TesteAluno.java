public class TesteAluno  {
    public static void main(String[]args){
        aluno a1 = new aluno("Givanildo","pisicologia",123123321,13,"a1","2periodo");
        aluno a2 = new aluno("garotinho","medicina",312312321);

        aluno a3 = new aluno("rodrigo","sistemas de informacao",31231231,19);
        aluno a4 = new aluno("silvo santos","jornalismo",123123132);

        System.out.println("A1==>>nome: "+a1.getnome() + " " + ",curso inscrito: "+ a1.getCursoInscrito()+ " "+",Numero de matricula: "+a1.getmatricula()+ " "+",idade: "+a1.getidade());

        System.out.println(a2.getnome());
        System.out.println(a2.getCursoInscrito());
        System.out.println(a2.getmatricula());

        System.out.println(a3.getnome());
        System.out.println(a3.getCursoInscrito());
        System.out.println(a3.getmatricula());
        System.out.println(a3.getidade());

        System.out.println(a4.getnome());
        System.out.println(a4.getCursoInscrito());
        System.out.println(a4.getmatricula());
    }

}
