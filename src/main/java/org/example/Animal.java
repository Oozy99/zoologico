package org.example;
public class Animal {

    public  String nombre;
    public  String genero;
    public Double peso;
    public Animal pareja;


    public Animal() {
    }

    public Animal(String nombre,Double peso) {
        this.nombre = nombre;
        this.peso = peso;

    }
    void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }



    }

