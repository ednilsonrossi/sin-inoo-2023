package projeto7_agenda;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionar(new Contato("Joao", "joao@email.com"));
        agenda.adicionar(new Contato("Maria", "maria@email.com"));
        agenda.adicionar(new Contato("Jose", "jose@email.com"));

        System.out.println(agenda.listarTodos());
    }
}
