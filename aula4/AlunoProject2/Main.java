package aula4.AlunoProject2;


public class Main {
    public static void main(String[] args) {

        AlunoESDD alunoESDD = new AlunoESDD("Hommer", 6, 5, 6);
        
        System.out.println(alunoESDD.toString());

        alunoESDD.setIfa(7);

        System.out.println(alunoESDD.toString());
    }

}
