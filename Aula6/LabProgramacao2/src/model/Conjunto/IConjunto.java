package model.Conjunto;

/**
 * IConjunto
 * 
 * Representa um conjunto de itens que são armazenados em memória primária.
 * 
 * @author Ednilson Geraldo Rossi
 */
public interface IConjunto<T> {

    /**
     * Adiciona um objeto passado como argumento no conjunto.
     * 
     * @param item  indica o item é inserido no conjunto. É permitida a inclusão de itens repetidos.
     * @return     true - caso o item seja inserido com sucesso. false - caso ocorra algum erro na inserção do item.
     */
    boolean add(T item);
    

    /**
     * Remove todos os elementos do conjunto.
     */
    void clear();

    /**
     * Verifica se um item está ou não no conjunto.
     * 
     * @param item Objeto que deseja-se verificar a existência no conjunto.
     * @return     True caso exista e false caso não exista.
     */
    boolean contais(T item);


    /**
     * Retorna o item que está em uma posição específica do conjunto.
     * 
     * @param position posição do conjunto que se deseja o item.
     * @return     Retorna o item caso a posição exista no conjunto, caso a posição não exista é retornado o valor null.
     */
    T get(int position);


    /**
     * Informa se o conjunto está vazio ou não.
     * @return     True caso não existam valores no conjunto e false caso existe algum item no conjunto.
     */
    boolean isEmpty();


    /**
     * Remove o item que está na posição indicada do conjunto. Caso a posiçõa não exista é retornado o valor null.
     * 
     * @param position     posição que se deseja excluir do conjunto
     * @return     Item excluído da posição, null caso posição seja inválida.
     */
    T remove(int position);


    /**
     * Remove a primeira ocorrencia do item na lista.
     * 
     * @param item Item que deseja-se remover do conjunto.
     * @return     True caso o item exista e seja removido. False caso o item não esteja presente no conjunto.
     */
    boolean remove(T item);


    /**
     * Informa a quantidade de itens armazenados no conjunto.
     * @return     Quantidade de itens existentes no conjunto.
     */
    int size();
}