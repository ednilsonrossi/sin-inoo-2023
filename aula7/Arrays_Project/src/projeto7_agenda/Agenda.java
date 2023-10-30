package projeto7_agenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> dataset;
    
    public Agenda(){
        dataset = new ArrayList<>();
    }

    public boolean adicionar(Contato contato){
        return dataset.add(contato);
    }

    public String listarTodos(){
        String todos = "";
        for(Contato c : dataset){
            todos += c.toString() + "\n";
        }
        return todos;
    }

}
