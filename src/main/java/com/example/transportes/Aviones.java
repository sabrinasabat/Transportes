package com.example.transportes;

public class Aviones extends Aereos{
    public float tiempoMaxVuelo;

    public Aviones(float tiempoMaxVuelo, int numAsientos, String matricula, String modelo){
        super(numAsientos, matricula, modelo);
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }
}
