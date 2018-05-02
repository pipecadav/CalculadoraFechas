/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafechas;

/**
 *
 * @author cadav
 */
public class CalculadoraFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Fechas.calcDiferenciaFechas("15/03/1988", "15/05/2018"));;
        System.out.println(Fechas.calcDiferenciaTiempo("15/03/1988", "18/03/1988"));;
    }
    
}
