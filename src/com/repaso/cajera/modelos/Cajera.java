package com.repaso.cajera.modelos;

/**
 * Clase en la cual vamos a procesar una cesta de clientes sin necesidad de la creacíon de concurrencia de hilos.
 */
public class Cajera {
    private String nombre;


    public Cajera(String nombre){
        this.nombre = nombre;
    }

    /**
     * Este metodo muestra por consola lo que tarda la cajera en consumier un clietne accede a otro cliente , de una manera estructurada.
     * @param cliente
     */
    public void procesarCompra(Cliente cliente){
        int[] cesta = cliente.getCestaDeLaCompra();
        for ( int producto: cesta){
            try {
                System.out.println("La cajara "+nombre+ " procesa el producto del cliente " + cliente.getNombre()+" en "+producto+ " sec ");
                Thread.sleep(producto *1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
