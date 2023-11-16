package view;

import model.*;

import java.util.Scanner;

public class Sistema {
    private static final Scanner scanner = new Scanner(System.in);


    public static void start(){
        Cardapio cardapio = new Cardapio();
        Produto produto = null;

        int continuar = 1;
        while(continuar != 0){
            switch (tipoPedido()){
                case INDIVIDUAL:
                    produto = escolherProduto(cardapio, null);
                    break;

                case COMBO:
                   produto = new Combo(
                           (Bebida) escolherProduto(cardapio, ItemCombo.BEBIDA),
                           (Lanche) escolherProduto(cardapio, ItemCombo.LANCHE),
                           (BatataFrita) escolherProduto(cardapio, ItemCombo.BATATA));
                   break;
            }
            System.out.println("==================================");
            System.out.println("Total a pagar: R$ " + produto.getPreco());
            System.out.println("==================================");

            System.out.println("Para encerrar o sistema digite zero, para continuar digite 1.");
            continuar = scanner.nextInt();
        }
    }

    private static TipoPedido tipoPedido(){
        int input;
        System.out.println("Tipo de pedido");
        System.out.println("1. Individual");
        System.out.println("2. Combo");
        do{
            System.out.println("Escolha:");
            input = scanner.nextInt();
        }while (!(input == 1 || input == 2));
        if(input == 1)
            return TipoPedido.INDIVIDUAL;
        else
            return TipoPedido.COMBO;
    }

    private static Produto escolherProduto(Cardapio cardapio, ItemCombo itemCombo){
        int posicao = 1, pedido;
        if(itemCombo == null) {
            System.out.println("Qual produto?");

            for (Produto p : cardapio.getProdutos()) {
                System.out.println(posicao + ". " + p.getNome() + " R$ " + p.getPreco());
                posicao++;
            }
            do {
                System.out.println("Seu pedido: ");
                pedido = scanner.nextInt();
            } while (pedido < 1 || pedido > posicao - 1);
            return cardapio.getProdutos().get(pedido - 1);
        }else{
            System.out.println("Escolha " + itemCombo.toString());
            for(Produto p : cardapio.getProdutos()){
                if(itemCombo == ItemCombo.BATATA){
                    if(p instanceof BatataFrita){
                        System.out.println(posicao + ". " + p.getNome() + " R$ " + p.getPreco());
                    }
                }else if (itemCombo == ItemCombo.BEBIDA){
                    if(p instanceof Bebida){
                        System.out.println(posicao + ". " + p.getNome() + " R$ " + p.getPreco());
                    }
                } else{
                    if (p instanceof Lanche){
                        System.out.println(posicao + ". " + p.getNome() + " R$ " + p.getPreco());
                    }
                }
                posicao++;
            }
            System.out.println("Seu pedido: ");
            pedido = scanner.nextInt();
            return cardapio.getProdutos().get(pedido - 1);
        }
    }

    enum TipoPedido{
        COMBO, INDIVIDUAL;
    }

    enum ItemCombo{
        BATATA, BEBIDA, LANCHE;
    }
}
