package com.repaso.cajera.modelos;

/**
 * Clase modelo de cliente , que contiene un Array de enteros que son los productos que almacen.
 * Un nombre de cada cliente
 */
public class Cliente {
    private int[] cestaDeLaCompra;
    private String nombre;

    /**
     * Constructor que con parametros el array cesta de la compra y el nombre del cliente.
     * @param cestaDeLaCompra
     * @param nombre
     */
    public Cliente(int[] cestaDeLaCompra, String nombre) {
        this.cestaDeLaCompra = cestaDeLaCompra;
        this.nombre = nombre;
    }

    public int[] getCestaDeLaCompra() {
        return cestaDeLaCompra;
    }

    public void setCestaDeLaCompra(int[] cestaDeLaCompra) {
        this.cestaDeLaCompra = cestaDeLaCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
