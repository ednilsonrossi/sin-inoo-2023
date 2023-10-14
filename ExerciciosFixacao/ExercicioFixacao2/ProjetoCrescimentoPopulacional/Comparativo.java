package ExercicioFixacao2.ProjetoCrescimentoPopulacional;

public class Comparativo {
    
    public static void main(String[] args) {
        Cidade araraquara = new Cidade(210000, 3);
        Cidade marilia = new Cidade(230000, 2);

        int contador = 0;
        while (araraquara.getPopulacaoAtual() < marilia.getPopulacaoAtual() ) {
            araraquara.aumentarPopulacao();
            marilia.aumentarPopulacao();
            contador += 1;
        }

        System.out.println("São necessários " + contador + " anos para Araraquara superar Marília");
    }

}
