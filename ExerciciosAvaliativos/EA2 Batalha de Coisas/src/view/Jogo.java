package view;

import model.confrontos.Confronto;
import model.confrontos.MelhorDe3;
import model.confrontos.Unico;
import model.jogadores.Bot;
import model.jogadores.Humano;
import model.jogadores.Jogador;

import java.util.Scanner;

public class Jogo {

    public static final Scanner scanner = new Scanner(System.in);


    public static void start(){
        Confronto confronto = null;
        Jogador jogador1 = null, jogador2 = null, ganhador;

        int tipoJogador = lerTipoJogadores();
        int tipoJogo = lerTipoDeJogo();

        if(tipoJogador == 1){
            jogador1 = new Humano(lerNome(), lerCoisa());
            jogador2 = new Humano(lerNome(), lerCoisa());
        }else if(tipoJogador == 2){
            jogador1 = new Humano(lerNome(), lerCoisa());
            jogador2 = new Bot();
        }else if(tipoJogador == 3){
            jogador1 = new Bot();
            jogador2 = new Bot();
        }

        if(tipoJogo == 1){
            confronto = new Unico(jogador1, jogador2);
        }else if (tipoJogo == 2){
            confronto = new MelhorDe3(jogador1, jogador2);
            MelhorDe3 m3 = (MelhorDe3) confronto;
            System.out.println(m3.getParcial());
            while( ! m3.partidaFechada() ){
                System.out.println("Coisa Jogador 1");
                int c1 = lerCoisa();
                System.out.println("Coisa Jogador 2");
                int c2 = lerCoisa();
                m3.novaBatalha(c1, c2);
                System.out.println(m3.getParcial());
            }
        }

        ganhador = confronto.getVencedor();
        System.out.println("Vencedor:");
        if(ganhador != null) {
            System.out.println("Jogador: " + ganhador.getNome());
            System.out.println("Pontos: " + ganhador.getPontos());
        }else{
            System.out.println("Empate!");
        }

    }

    private static int lerTipoDeJogo(){
        int opcao;
        do {
            System.out.println("Tipo de jogo:");
            System.out.println("(1) Confronto único");
            System.out.println("(2) Melhor de 3");
            System.out.println("Sua escolha: ");
            opcao = scanner.nextInt();
        }while(opcao < 1 || opcao > 2);
        return opcao;
    }

    private static int lerTipoJogadores(){
        int opcao;
        do{
            System.out.println("Tipos de jogadores");
            System.out.println("(1) Humano x Humano");
            System.out.println("(2) Humano x Bot");
            System.out.println("(3) Bot x Bot");
            System.out.println("Sua escolha: ");
            opcao = scanner.nextInt();
        }while (opcao < 1 || opcao > 3);
        return opcao;
    }

    private static int lerCoisa(){
        int opcao;
        do{
            System.out.println("Escolha da arma");
            System.out.println("(1) Pedra");
            System.out.println("(2) Papel");
            System.out.println("(3) Tesousa");
            System.out.println("Sua escolha: ");
            opcao = scanner.nextInt();
        }while (opcao < 1 || opcao > 3);
        return opcao;
    }

    private static String lerNome(){
        String str;
        System.out.println("Nome do jogador: ");
        do {
            str = scanner.nextLine();
        }while (str.isEmpty());
        return str;
    }
}
