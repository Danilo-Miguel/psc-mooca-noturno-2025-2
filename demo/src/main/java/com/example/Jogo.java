package com.example;


public class Jogo {

    public static void main(String[] args) {
        Personagem cacador = new Personagem();
        cacador.nome = "João";


        while(true){
        cacador.cacar();
        cacador.comer();
        cacador.dormir();
        cacador.cacar();
        cacador.cacar();
        cacador.cacar();
        System.out.println("========================");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
