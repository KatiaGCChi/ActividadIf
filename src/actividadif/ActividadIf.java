/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadif;

import java.util.Scanner;

/**
 *
 * @author TRUJEQUE
 */
public class ActividadIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int añoActual = 2021;
        int año_seleccionado;
        int años;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Asigne el año");
        año_seleccionado = entrada.nextInt();
        
        if (añoActual > año_seleccionado) {
            años = (añoActual - año_seleccionado);
            System.out.println("Los años que han pasado son: " + años) ;
        } else if (año_seleccionado > añoActual) {
            años = (año_seleccionado - añoActual);
            System.out.println("Los numeros que faltan son: " + años);
        }
    }
    
}
