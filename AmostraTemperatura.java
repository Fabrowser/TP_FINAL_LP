/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_final;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

/**
 *
 * @author fabri
 */
public class AmostraTemperatura {
    
    private int numseq;
    private float valor; 
    private Calendar horario; // Classe que trabalha com Data e Hora de forma prática
    
    
     Scanner scan= new Scanner(System.in); 

     
            
//Recebe do usuário os valores iniciais;
    AmostraTemperatura(){

         this.horario = Calendar.getInstance();
        // Coloca valores digitados nos atributos da Classe Calendar
         horario.set(1,1,1,0,0,0); 
    }

    // Recebe do construtor sem parâmetros os dados para Setar os atributos
    AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v){

         this.horario = Calendar.getInstance();
        // Coloca valores digitados nos atributos da Classe Calendar através do construtor.
        if(b==0){
         horario.set(c, b+1, a, d, e,f); 
        }else{
         horario.set(c, b, a, d, e,f);// b diminui 1, pois mês é um array que começa em 0; 
        

        
        }  
    }
    
    AmostraTemperatura(Calendar h, float v)
    {

    }
    public void setData(){
        
                        
          //Recebe e testa o dia
        int dia = 0;
        while(dia<1 | dia>30){
		System.out.println("Digite o dia:  ");
		dia = scan.nextInt();
                            }
        
        
  //Recebe e testa o mês;
         int mes = 0;
          while(mes<1 |mes>12){
		System.out.println("Digite o mês:  ");
		mes = scan.nextInt();
                            }
          
          
 //Recebe e testa o ano;
          int ano = 0;
          while(ano<1){
		System.out.println("Digite o ano:  ");
		ano= scan.nextInt();
                            }
          
          setData(dia,mes,ano);
          
    }
    
      
    
    public void setData(int a, int b, int c){
       
         horario.set(Calendar.DAY_OF_MONTH, a);
         horario.set(Calendar.MONTH, b);
         horario.set(Calendar.YEAR ,c);

    }
    
    
    
    public void setHora()
    {
        
     
             //Recebe e testa a hora;     
          int hora = -1;
          while(hora<0 | hora>23){
		System.out.println("Digite a hora:  ");
		hora = scan.nextInt();
                            }
  //Recebe e testa os minutos ;    
           int minutos = -1;
          while(minutos<0 | minutos>59){
		System.out.println("Digite os minutos:  ");
		minutos = scan.nextInt();
                            }
  //Recebe e testa os segundos;       
           int segundos = -1;
          while(segundos<0 | segundos>59){
		System.out.println("Digite os segundos:  ");
		segundos = scan.nextInt();
                            }
          
          setHora(hora,minutos,segundos);

    }
    

    public void setHora(int a, int b, int c){
        
         horario.set(Calendar.HOUR_OF_DAY, a);
         horario.set(Calendar.MINUTE, b);
         horario.set(Calendar.SECOND ,c);

    }



     public void setValor(float v)
     {   
         valor = v;

     }

     public void setValor(){
     
        System.out.println("Digite a temperatura: ");
        float temp = scan.nextFloat();
        numseq++;
        
        setValor(temp);
     
     }
     
     
     public int getNumSeq(){
     return numseq;
     
     }
     
     public String getData(){
     
                  
       return (horario.get(Calendar.DAY_OF_MONTH) 
                 + "/" 
                 + horario.get(Calendar.MONTH)
                 + "/"
                 + horario.get(Calendar.YEAR));
  
     
     }
     
       
     public String getHora(){
             
        return (horario.get(Calendar.HOUR_OF_DAY) 
                 + ":" 
                 + horario.get(Calendar.MINUTE)
                 + ":"
                 + horario.get(Calendar.SECOND));

     }
     
     
     public float getValor(){
         
     return valor;
     }   
}
