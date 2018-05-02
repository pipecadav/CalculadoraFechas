/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafechas;


import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author Felipe Cadavid
 */
public class Fechas {
    
    public static String calcDiferenciaFechas(String fechaInicial, String fechaFinal){
        LocalDate fecha1 = formatearFecha(fechaInicial);
        LocalDate fecha2 = formatearFecha(fechaFinal);
        Period periodo = Period.between(fecha1, fecha2);
        return ("La Diferencia es "+periodo.getYears()+" año(s), "+periodo.getMonths()+" mes(es) y "+periodo.getDays()+" día(s)");
        
    }
    
    public static String calcDiferenciaTiempo(String fechaInicial, String fechaFinal){
        Date fecha1 = formatearTiempo(fechaInicial);
        Date fecha2 = formatearTiempo(fechaFinal);
        long millisec = fecha2.getTime() - fecha1.getTime();
        
        return (convertirMilliseconds(millisec));
    }
    
    public static LocalDate formatearFecha(String laFecha){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate lcd = LocalDate.parse(laFecha, fmt);
        return lcd;
    }
    
    public static Date formatearTiempo(String laFecha){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Date dt = Date.valueOf(LocalDate.parse(laFecha, fmt));
        return dt;
    }
    
    public static String convertirMilliseconds(long miliSeconds){
        int hrs = (int) TimeUnit.MILLISECONDS.toHours(miliSeconds);
        int min = (int) TimeUnit.MILLISECONDS.toMinutes(miliSeconds) % 60;
        int sec = (int) TimeUnit.MILLISECONDS.toSeconds(miliSeconds) % 60;
        return String.format("%02d:%02d:%02d", hrs, min, sec);
 }
    
    
}
