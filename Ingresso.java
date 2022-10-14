package com.mycompany.atividade4.po;

public class Ingresso {
    public double valor;
    
    //Metodos
    Ingresso(){
        valor = 30;
    }
    
    void imprimeValor(){
        System.out.println("Valor do ingresso: R$" + valor);
    }
    
   
}
