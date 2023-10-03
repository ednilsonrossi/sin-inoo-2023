package aula5.AtendimentoClienteProject;

public class FilaCircular extends Fila {

    private static final int MAXSIZE = 50;

    private Cliente elementos[];
    private int inicio;
    private int fim;
    private int tamanho;
    private int tamanho_maximo;
    
    public FilaCircular(){
        this.tamanho_maximo = MAXSIZE;
        init();
    }

    public FilaCircular(int tamanho){
        this.tamanho_maximo = tamanho;
        init();
    }

    private void init(){
        this.elementos = new Cliente[tamanho_maximo];
        this.inicio = -1;
        this.fim = -1;
        this.tamanho = 0;
    }

    @Override
    public Cliente dequeue() {
        Cliente c = null;
        if(!isEmpty()){
            if(inicio == tamanho_maximo - 1){
                inicio = 0;
            }else{
                inicio += 1;
            }
            c = elementos[inicio];
            tamanho -= 1;
            elementos[inicio] = null;
        }
        return c;
    }

    @Override
    public boolean enqueue(Cliente cliente) {
        if(!isFull()){
            if(fim == tamanho_maximo - 1){
                fim = 0;
            }else{
                fim += 1;
            }
            elementos[fim] = cliente;
            tamanho += 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    @Override
    public boolean isFull() {
        return this.tamanho == this.tamanho_maximo;
    }
}
