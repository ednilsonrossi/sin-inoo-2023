package aula3.ProjetoData;

public class MinhaData {
    private int dia;
    private int mes;
    private int ano;
    private boolean ehValida;

    public MinhaData(int dia, int mes, int ano){
        this.ehValida = false;
        if(ano > 1000 && ano < 3000){
            this.ano = ano;
            if(mes > 0 && mes <= 12){
                this.mes = mes;
                if(dia > 0 && dia <= qntdDias()){
                    this.dia = dia;
                    this.ehValida = true;
                }
            }
        }
    }

    public String dataPTBR(){
        String str;
        if(ehValida)
            str = dia + "/" + mes + "/" + ano;
        else
            str = "Data inválida.";
        return str;
    }

    public String dataUS(){
        if(ehValida)
            return ano + "-" + mes + "-" + dia;
        else
            return "Data inválida.";
    }

    private int qntdDias(){
        int dias = 0;
        switch(this.mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = ehBissexto() ? 29 : 28;
                break;
        }
        return dias;
    }

    private boolean ehBissexto(){
        if( (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0 ){
            return true;
        }
        return false;
    }
}
