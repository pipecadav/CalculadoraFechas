/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafechas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Date;

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
    
    public static void calcDiferenciaTiempo(String fechaInicial, String fechaFinal){
        LocalDate fecha1 = formatearFecha(fechaInicial);
        LocalDate fecha2 = formatearFecha(fechaFinal);
        
        Duration duracion;
        
        
    }
    
    public static LocalDate formatearFecha(String laFecha){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate lcd = LocalDate.parse(laFecha, fmt);
        return lcd;
    }
    
    public static Temporal formatearTiempo(String laFecha){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate lcd = LocalDate.parse(laFecha, fmt);
        return lcd;
    }
}
