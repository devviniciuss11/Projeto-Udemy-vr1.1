public class TesteUsuario {
    public static void main(String[]args){
        usuario a1 = new usuario("Vinicius","jjasdi@gmail.com");
        usuario a2 = new usuario("Alexandre","Alexendrepato@gmail.com");
        usuario a3 = new usuario("silvano","neymarsantos@gmail.com","neymar2015boladeouro123","aluno","asdas");

        System.out.println(a1.getnome());
        System.out.println(a1.getemail());

        System.out.println(a2.getnome());
        System.out.println(a2.getemail());

        System.out.println("nome do usuario: "+a3.getnome());
        System.out.println(a3.getemail());
        System.out.println(a3.getsenha());
        System.out.println(a3.getid());

    }
}
