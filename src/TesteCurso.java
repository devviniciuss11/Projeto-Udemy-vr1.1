public class TesteCurso {
    public static void main(String[]args){
        curso c1 = new curso("sistemas de informacao");
        curso c2 = new curso("matematica","calculos e calculos...");
        curso c3 = new curso("fisioterapia","selecao brasileira copa do mundo","200hrs");

    System.out.println("nome do curso: "+c1.getnomeCurso());

    System.out.println("nome do curso: "+c2.getnomeCurso());
    System.out.println("descricao do curso: "+c2.getdescricaoCurso());

    System.out.println("nome do curso: "+c3.getnomeCurso());
    System.out.println("descricao do curso: "+c3.getdescricaoCurso());
    System.out.println("carga Horaria do curso: "+c3.getcargaHoraria());
    }

}
