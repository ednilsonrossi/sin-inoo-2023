import java.util.Scanner;

import model.coin.*;
import model.piggyBank.Cofrinho;
import model.piggyBank.Montinhos;

public class Main {
    
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Cofrinho mPiggyBank = new Cofrinho();
        Moeda coin;
        int menu;

        do{
            menu = opcoes();
            switch(menu){
                case 1:
                    mPiggyBank.insereMoeda(tipoMoeda());
                    break;

                case 2:
                    System.out.println("Total de moedas: " + mPiggyBank.quantidadeMoedas());
                    break;

                case 3:
                    coin = tipoMoeda();
                    System.out.printf("Existem %d moedas de %s\n", 
                            mPiggyBank.quantasMoedas(coin),
                            coin.toString());
                    break;

                case 4:
                    System.out.printf("Valor guardado: R$ %.2f\n", mPiggyBank.totalCofrinho());
                    break;

                case 5:
                    Montinhos montinhos = mPiggyBank.quebrarCofrinho();
                    System.out.printf("Pilha com %d moedas de %s\n", montinhos.get(new Um()).getQuantity(), new Um().toString());
                    System.out.printf("Pilha com %d moedas de %s\n", montinhos.get(new Cinco()).getQuantity(), new Cinco().toString());
                    System.out.printf("Pilha com %d moedas de %s\n", montinhos.get(new Dez()).getQuantity(), new Dez().toString());
                    System.out.printf("Pilha com %d moedas de %s\n", montinhos.get(new VinteCinco()).getQuantity(), new VinteCinco().toString());
                    System.out.printf("Pilha com %d moedas de %s\n", montinhos.get(new Cinquenta()).getQuantity(), new Cinquenta().toString());
                    System.out.printf("Pilha com %d moedas de %s\n", montinhos.get(new UmReal()).getQuantity(), new UmReal().toString());
                    break;

                default:
                    System.out.println("opção inválida.");

            }
        }while(menu != 0);
    }



    public final static int opcoes(){
        
        System.out.println("-------------------------------");
        System.out.println("1. Guardar moeda");
        System.out.println("2. Quantidade de moedas");
        System.out.println("3. Quantidade de moedas por valor");
        System.out.println("4. Valor do cofrinho");
        System.out.println("5. Quebrar cofrinho");
        System.out.println("0 - Sair");
        System.out.println("O que deseja fazer?");
        int value = input.nextInt();
        return value;
    }

    public static Moeda tipoMoeda() {
        
        System.out.println("-----QUAL MOEDA?---------------");
        System.out.println("1. 0.01");
        System.out.println("2. 0.05");
        System.out.println("3. 0.10");
        System.out.println("4. 0.25");
        System.out.println("5. 0.50");
        System.out.println("6. 1.00");
        System.out.println("informe a opção:");
        int value = input.nextInt();
    
        switch (value) {
            case 1:
                return new Um();

            case 2:
                return new Cinco();

            case 3:
                return new Dez();

            case 4:
                return new VinteCinco();

            case 5:
                return new Cinquenta();

            case 6:
                return new UmReal();

            default:
                return null;
        }
    }
}
