/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp_final;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class TP_FINAL {

    public static void main(String[] args) {

        System.out.println("____TEMPERATURA ___" + "\n");
     
       AmostraTemperatura t1 = new AmostraTemperatura(1,0,1,0,0,0,0);
    
        System.out.println("--- VALORES T1 ---");
        System.out.println();
        System.out.println("DATA: " + t1.getData());
        System.out.println("HORA: " +t1.getHora());
        System.out.println("VALOR: " + t1.getValor());
        System.out.println("NUM SEQ: " +t1.getNumSeq());
        System.out.println();
        
        AmostraTemperatura t2 = new AmostraTemperatura();
        
        System.out.println("--- VALORES T2 ---");
        System.out.println();
        System.out.println("DATA: " + t2.getData());
        System.out.println("HORA: " +t2.getHora());
        System.out.println("VALOR: " + t2.getValor());
        System.out.println("NUM SEQ: " +t2.getNumSeq());
        System.out.println();
        
        
        // ALTERANDO VALORES T1
        t1.setData();
        t1.setHora();
        t1.setValor();
        t1.getNumSeq();
        
        
        //MOSTRANDO VALORES T1 ALTERADOS
        System.out.println("--- VALORES T1 ---");
        System.out.println();
        System.out.println("DATA: " + t1.getData());
        System.out.println("HORA: " +t1.getHora());
        System.out.println("VALOR: " + t1.getValor());
        System.out.println("NUM SEQ: " +t1.getNumSeq());
        System.out.println();

    }
    
    
}
