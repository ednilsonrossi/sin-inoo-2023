public class ClientCode {
    public static void main(String[] args) {


        DiaDosNamorados cartao = new DiaDosNamorados("Maria", "José");
        System.out.println(cartao.showMessage());

        Natal cartao2 = new Natal("Jair", "Luiz");
        System.out.println(cartao2.showMessage());
        
    }
}
