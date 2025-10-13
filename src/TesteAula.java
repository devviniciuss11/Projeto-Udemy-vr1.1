public class TesteAula {
    public static void main(String[]args){
        aula a1= new aula(7.30);
        aula a2= new aula(7.00,"25/05/2326");
        aula a3= new aula(7.24,"12/03/2024","Paulo roberto");

        System.out.println(a1.gethorario());

        System.out.println(a2.gethorario());
        System.out.println(a2.getdata());

        System.out.println(a3.gethorario());
        System.out.println(a3.getdata());
        System.out.println(a3.getprofessor());
    }
}
