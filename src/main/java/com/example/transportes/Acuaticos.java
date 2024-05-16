package com.example.transportes;

public class Acuaticos extends Vehiculo{

    public final int eslora;

    public Acuaticos(int eslora, String matricula, String modelo){
        super(matricula, modelo);
        this.eslora = eslora;

    }

    public int getEslora(){
        return eslora;
    }

    public void imprimir(){
        System.out.println("------------------------------------------------------");
        System.out.println("MATRICULA: "+this.getMatricula());
        System.out.println("MODELO: "+this.getModelo());
        System.out.println("ESLORA: "+this.getEslora());
    }


    @Override
    public String toString(){
        return String.format("La eslora de los acuáticos es: "+this.getEslora());
    }



}
