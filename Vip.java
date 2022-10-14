package com.mycompany.atividade4.po;


public class Vip extends Ingresso{
   public double valorAdicional;
   
   Vip(){
       valorAdicional = 50;
   }
   void imprimeValor(){
       System.out.println("Valor do ingresso: " + valor);
       System.out.println("Valor adicional do ingresso VIP: " + valorAdicional );
   }
}
