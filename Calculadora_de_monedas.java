/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_de_monedas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadora_de_monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lec=new Scanner (System.in);
        System.out.println("ingrese la cantidad de monedas a convertir ");
        double pesos =lec.nextDouble();
        double dolar, yen,euros,libras;
        dolar= pesos/17.07;
        euros=pesos/18.21;
        yen=pesos/0.12;
        libras= pesos/21.118;
        System.out.println("dolar: " +dolar);
        System.out.println("euros: "+euros);
        System.out.println("yen: "  +yen);
        System.out.println("libras " +libras);
       
    }
    
}
