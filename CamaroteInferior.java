package com.mycompany.atividade4.po;


public class CamaroteInferior extends Vip {
    int numeroCadeira;
    //Metodos
    
    public int getCadeira(){
        return numeroCadeira;
    }
    void imprimeCadeira(){
        System.out.println("Sua cadeira eh: " + numeroCadeira);
    }
}
