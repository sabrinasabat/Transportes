package com.example.transportes;

public abstract class Vehiculo {

    private final String matricula;
    private final String modelo;

    protected Vehiculo (String matricula, String modelo){
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public abstract void imprimir();

    public String getMatricula(){
        return matricula;
    }
    public String getModelo(){
        return modelo;
    }

}
