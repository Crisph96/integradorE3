package com.abraham.myapplication.models;

public class Tour {
    private String nombre;
    private String ciudad;
    private double precio;

    public Tour(String nombre, String ciudad, double precio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public double getPrecio() { return precio; }
}
