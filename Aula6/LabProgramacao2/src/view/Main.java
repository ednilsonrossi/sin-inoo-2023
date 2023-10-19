package view;

import model.Conjunto.ArrayConjunto;
import model.Conjunto.IConjunto;
import model.Dados.Nada;

public class Main {
    public static void main(String[] args) {
        IConjunto<Nada> nadas = new ArrayConjunto<>();

        /*Inserindo 5 Nadas*/
        for(int i=0; i != 5; i++){
            nadas.add(new Nada());
        }

        /*Mostrando todos os nadas */
        System.out.println("Mostrando os nadas: ");
        for(int i=0; i!= nadas.size(); i++){
            System.out.println(nadas.get(i).toString());
        }
        System.out.println();

        /*Adicionando mais 20 nadas*/
        for(int i=0; i != 20; i++){
            nadas.add(new Nada());
        }

        /*Mostrando todos os nadas */
        System.out.println("Mostrando os nadas: ");
        for(int i=0; i!= nadas.size(); i++){
            System.out.println(nadas.get(i).toString());
        }
        System.out.println();

        /*Existem um nada */
        System.out.println("Verificando se existem os nadas");
        System.out.println("Nada(12): " + nadas.contais(new Nada(12)));
        System.out.println("Nada(7): " + nadas.contais(new Nada(7)));
        System.out.println("Nada(120): " + nadas.contais(new Nada(120)));
        System.out.println();

        /*Apagar alguns nadas */
        nadas.remove(12);
        nadas.remove(7);
        nadas.remove(new Nada(17));

        /*Mostrando todos os nadas */
        System.out.println("Mostrando os nadas: ");
        for(int i=0; i!= nadas.size(); i++){
            System.out.println(nadas.get(i).toString());
        }
        System.out.println();

        /*Limpar o conjunto */
        System.out.println("Limpando o conjunto.");
        nadas.clear();

        /*Mostrando todos os nadas */
        System.out.println("Mostrando os nadas: ");
        for(int i=0; i!= nadas.size(); i++){
            System.out.println(nadas.get(i).toString());
        }
        System.out.println();
    }
}
