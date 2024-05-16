package com.example.transportes;

public class Aereos extends Vehiculo {

    public final int numAsientos;

    public Aereos(int numAsientos, String matricula, String modelo){
        super(matricula, modelo);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos(){
        return numAsientos;
    }

    public String setMatricula(String matricula){
        for(int i=0; i<matricula.length(); i++){
            i = i+1;
        }
        if(matricula.length()>11){
            System.out.println("ERROR DE MATRICULA");
        }
        return matricula;
    }

    @Override
    public String toString(){
        return String.format("El número de asiento es: %s\nEl modelo es: ",this.getNumAsientos(),this.getModelo());
    }

    public void imprimir(){
        System.out.println("------------------------------------------------------");
        System.out.println("MODELO: "+this.getModelo());
        System.out.println("MATRICULA: "+this.getMatricula());
        System.out.println("ASIENTO: "+this.getNumAsientos());
    }


}
