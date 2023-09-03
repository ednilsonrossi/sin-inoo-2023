package aula3.ExemplosStrings;

public class Exemplo16 {
    public static void main(String[] args) {
        String str = "Os alunos do TSI não quebram o TAD.";

        System.out.println(str.contains("TSI"));
        System.out.println(str.contains("tsi"));
        System.out.println(str.toLowerCase().contains("tsi"));
    }
}
