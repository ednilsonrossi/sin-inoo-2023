package model.piggyBank;

import model.coin.Moeda;

/**
 * ICofrinho
 */
public interface ICofrinho {

    /**
     * Insere uma moeda no cofrinho
     * @param coin
     */
    void insereMoeda(Moeda coin);
    

    /**
     * Método informa a quantidade de moedas do mesmo tipo passado como
     * argumento q estão no cofrinho no momento.
     * 
     * @param coin Tipo da moeda que deseja-se verificar a quantidade no cofrinho
     * @return Quantidade de moedas iguais as passadas por argumento. Se não houver moeda retorna zero.
     */
    int quantasMoedas(Moeda coin);


    /**
     * Informa a quantidade total de moedas no cofrinho, independente da moeda.
     * 
     * @return Quantidade de moedas no cofrinho. Caso de cofrinho vazio retorna zero.
     */
    int quantidadeMoedas();


    /**
     * Retorna o valor em Reais armazenado no cofrinho.
     * @return
     */
    double totalCofrinho();

    /**
     * Quebrar o cofrinho é jogar todas as moedas para fora e destruir os valores armazenados.
     * O cofrinho volta ao valor inicial, ou seja, fica sem moedas.
     * 
     * @return As moedas que estavam no cofrinho são empilhadas e devolvidas em um objeto Montinhos que possue um Montinho para cada tipo de moeda existente no  cofrinho.
     */
    Montinhos quebrarCofrinho();
}