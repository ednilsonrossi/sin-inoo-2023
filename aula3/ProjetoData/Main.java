package aula3.ProjetoData;

public class Main {
    
    public static void main(String[] args) {
        
        MinhaData hoje;
        hoje = new MinhaData(15, 8, 2023);
        System.out.println("Hoje");
        System.out.println("Hoje no Brasil: " + hoje.dataPTBR());
        System.out.println("Hoje nos EUA..: " + hoje.dataUS());

        MinhaData outroDia = new MinhaData(29, 2, 2021);
        System.out.println("Outro dia");
        System.out.println("Hoje no Brasil: " + outroDia.dataPTBR());
        System.out.println("Hoje nos EUA..: " + outroDia.dataUS());
    }
}
