public class GalToLitTable {

    public static void main(String[] args) {
        int galao;
        double litros;
        int contador;

        contador = 0;
        for(galao = 1; galao <= 100; galao += 1){
            litros = galao * 3.7854;
            System.out.printf("%4d galão(ões) equivale à %.4f litros\n", galao, litros);
            contador += 1;

            if(contador == 10){
                System.out.println();
                contador = 0;
            }
        }
    }
}
