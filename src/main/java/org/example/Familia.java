package org.example;

public class Familia {

    public Animal papa;
    public Animal mama;
    public Animal hijo;

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    public void imprimirFamilia() {

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: " + this.papa.nombre +" "+
                        "La mamá es: " + this.mama.nombre +" "+
                        "El hijo es: " + this.hijo.nombre
        );

    }

    public void tenerHijo(String nombre) {

        if(this.papa.pareja!=null){

            Animal hijo= new Animal();
            hijo.nombre = nombre;
            hijo.peso=1.5;
            double random = Math.random();
            if(random<0.5){
                hijo.genero="F";
            }else{
                hijo.genero="M";
            }
            this.hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }




}
