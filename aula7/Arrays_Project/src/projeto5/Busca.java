package projeto5;

public class Busca {

    public static void main(String[] args) {
        
        int dataset[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int searchKey = 6;

        for (int i : dataset) {
            if(i == searchKey){
                System.out.println("Encontrado!");
                break;
            }
        }
    }
}
