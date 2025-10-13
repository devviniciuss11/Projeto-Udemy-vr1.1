public class TesteProfessor {
    public static void main(String[] args){
        professor p1 = new professor("Vinicius");
        professor p2 = new professor("silvana","sou professora de geografia no ifpe");
        professor p3 = new professor("Renato","Sou professor de educação fisica na ufpe","bacharel em educacao fisica");

        System.out.println("ola,professor: " + p1.getnome());

        System.out.println("ola,professor: " + p2.getnome());
        System.out.println("biografia: " + p2.getbiografia());
        System.out.println("qualificacoes: " + p3.getqualificacoes());

        System.out.println("ola,professor: " + p3.getnome());
        System.out.println("biografia: " + p3.getbiografia());
        System.out.println("qualificacoes: " + p3.getqualificacoes());
    }
}
