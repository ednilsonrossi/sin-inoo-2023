package Aula6.FilaGenericsProject.view;

import Aula6.FilaGenericsProject.model.DataClass.Nada;
import Aula6.FilaGenericsProject.model.DataClass.QualquerCoisa;
import Aula6.FilaGenericsProject.model.Queue.FilaCircular;
import Aula6.FilaGenericsProject.model.Queue.IFila;

public class Main {
    public static void main(String[] args) {
        
        IFila<Nada> nadas = new FilaCircular<Nada>(5);
        nadas.enqueue(new Nada());
        //nadas.enqueue(new QualquerCoisa()); //Aqui temos erro de compilação.
        nadas.enqueue(new Nada());

        while(!nadas.isEmpty()){
            System.out.println(nadas.dequeue().toString());
        }

        IFila<QualquerCoisa> coisas = new FilaCircular<>(3);
        coisas.enqueue(new QualquerCoisa());
        coisas.enqueue(new QualquerCoisa());
        coisas.enqueue(new QualquerCoisa());
        
        while(!coisas.isEmpty()){
            System.out.println(coisas.dequeue().toString());
        }
    }
}
