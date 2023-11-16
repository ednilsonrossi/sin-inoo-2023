package view;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<Produto> produtos;

    public Cardapio(){
        produtos = new ArrayList<>();
        produtos.add(new Bebida("Guaraná São Carlos", TipoBebida.REFRIGERANTE, 6.9));
        produtos.add(new Bebida("Roller", TipoBebida.REFRIGERANTE, 8.5));
        produtos.add(new Bebida("Suco de polpa", TipoBebida.SUCO, 12));
        produtos.add(new BatataFrita(TamanhoBatata.PEQUENA));
        produtos.add(new BatataFrita(TamanhoBatata.MEDIA));
        produtos.add(new BatataFrita(TamanhoBatata.GRANDE));
        produtos.add(new Lanche("X Salada", 32.9));
        produtos.add(new Lanche("X Tudo", 42.5));

    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionaProduto(Produto produto){
        produtos.add(produto);
    }

    public Produto getProduto(int posicao){
        return produtos.get(posicao);
    }
}
