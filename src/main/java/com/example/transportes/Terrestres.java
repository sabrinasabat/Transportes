package com.example.transportes;

public class Terrestres extends Vehiculo{

    public final int numRuedas;

    public Terrestres(String matricula, String modelo, int numRuedas){
        super (matricula, modelo);
            this.numRuedas = numRuedas;
        }

    public int getNumRuedas(){
        return numRuedas;
    }

    public void imprimir(){
        System.out.println("------------------------------------------------------");
        System.out.println("===          Detalles del vehículo          ===");
        System.out.println("MATRICULA: "+this.getMatricula());
        System.out.println("MODELO: "+this.getModelo());
        System.out.println("NÚMERO DE RUEDAS: "+this.getNumRuedas());
    }

    @Override
    public String toString(){
        return String.format("La matricula del vehículo es: %s\nEl modelo del vehículo es: %s\nEl número de ruedas que el vehículo tiene es: %s\n", this.getMatricula(), this.getModelo(), this.getNumRuedas());
    }

}