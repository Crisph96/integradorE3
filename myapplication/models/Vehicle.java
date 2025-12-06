package com.abraham.myapplication.models;

public class Vehicle {
    private String marca;
    private String modelo;
    private double precioDia;

    public Vehicle(String marca, String modelo, double precioDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioDia = precioDia;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getPrecioDia() { return precioDia; }
}
