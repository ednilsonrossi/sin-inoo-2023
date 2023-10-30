package projeto8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        lista.add("Araraquara");
        lista.add("São Carlos");
        lista.add("Ibaté");
        lista.add("Grande Ibitinga");

        /*Percorre a lista usando índice */
        for(int i = 0; i != lista.size(); i++){
            System.out.println(lista.get(i));
        }

        /*Percorre a lista usando for-each */
        for(String s : lista){
            System.out.println(s);
        }

        /*Usando iterator */
        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*Usando lambda */
        lista.forEach(str -> System.out.println(str) );
    }
}
