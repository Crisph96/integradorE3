package com.abraham.myapplication.models;

public class Transport {
    private String origen;
    private String destino;
    private double precio;

    public Transport(String origen, String destino, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public double getPrecio() { return precio; }
}
