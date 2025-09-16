package com.example;


public class Personagem {
String nome;
private int energia = 10;
private int fome = 0;
private int sono = 0;

public Personagem(int energia, int fome, int sono){
     System.out.println(energia);
    System.out.println(this.energia);
    if(energia >= 0 && energia <= 10)
    this.energia =  energia;
    if(fome >= 0 && fome <= 10)
    this.fome =  fome;
    if (sono >= 0 && sono <= 10)
    this.sono = sono;


}

public void cacar (){
    if(energia >= 2) {
    System.out.println(nome + " caçando");
    energia-=2;
    }else{
        System.out.println(nome + " Sem energia para caçar");
    }
    fome = Math.min(fome + 1 , 10);
    sono = Math.min( sono + 1 , 10);

}

public void comer(){
    if(fome >= 1){
    System.out.println(nome + "comendo");
    energia = Math.min( energia + 1 , 10);
    fome = fome - 1;
    }else{
        System.out.println(nome + " sem fome");
    }
}

public void dormir(){
    if (sono >= 1) {
    System.out.println(nome + " dormindo");
    sono -= 1;
   // energia = Math.min( energia + 1 , 10);
    energia = energia + 1 <= 10 ? energia + 1: 10;
    }else{
        System.out.println(nome +" sem sono");
    }
}
}