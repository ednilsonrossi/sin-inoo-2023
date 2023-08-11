package aula3;

public class Floyd {
    private int linhas;

    public void imprimeTriangulo(int n, boolean numeros){
        if(n > 0){
            linhas = n;
            if(numeros){
                imprimeNumeros();
            }else{
                imprimeCaracter();
            }
        }else{
            System.out.println("Não é possível gerar o triangulo para esses dados.");
        }
    }

    private void imprimeNumeros(){
        int value = 1;
        int lin, col;

        for(lin = 0; lin < linhas; lin += 1){
            for(col = 0; col <= lin; col += 1){
                System.out.printf("%d ", value);
                value += 1;
            }
            System.out.printf("\n");
        }
    }

    private void imprimeCaracter(){
        int lin, col;

        for(lin = 0; lin < linhas; lin += 1){
            for(col = 0; col <= lin; col += 1){
                System.out.printf("#");
            }
            System.out.printf("\n");
        }        
    }

    public static void main(String[] args) {
        Floyd floyd = new Floyd();
        System.out.println("Com números: ");
        floyd.imprimeTriangulo(6, true);
        System.out.println("Com #");
        floyd.imprimeTriangulo(6, false);
    }
}
