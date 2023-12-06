package model;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Boleto {
    private long codigoBarras;
    private LocalDate dataVencimento;
    private double valor;

    public Boleto(long codigoBarras) {
        this.codigoBarras = codigoBarras;
        extrairData();
        extrairValor();
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public String getVencimento(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataVencimento.format(formatter);
    }

    public double getValor() {
        return valor;
    }

//    public long diasAtraso(){
//        LocalDate hoje = LocalDate.now();
//        Period periodo = Period.between(dataVencimento, hoje);
//
//        if (periodo.isNegative()){
//            return 0;
//        }else{
//            return periodo.getDays();
//        }
//    }

//    public long diasAtraso(){
//        LocalDate hoje = LocalDate.now();
//        Period periodo = Period.between(dataVencimento, hoje);
//
//        if (periodo.isNegative()){
//            return 0;
//        }else{
//            return periodo.getYears() * 365 +
//                    periodo.getMonths() * 30 +
//                    periodo.getDays();
//        }
//    }

    public long diasAtraso(){
        LocalDate hoje = LocalDate.now();

        if(dataVencimento.isAfter(hoje) || dataVencimento.isEqual(hoje)){
            return 0;
        }else{
            return ChronoUnit.DAYS.between(dataVencimento, hoje);
        }
    }

    private void extrairData(){
        int dias;
        dias = (int) (codigoBarras / Math.pow(10, 10));
        LocalDate dataBase = LocalDate.of(1997, Month.OCTOBER, 07);
        dataVencimento = dataBase.plusDays(dias);
    }

    private void extrairValor(){
        valor = (long) (codigoBarras % Math.pow(10, 10));
        valor = valor / 100.0;
    }
}
