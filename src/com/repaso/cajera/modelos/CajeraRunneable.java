package com.repaso.cajera.modelos;

/**
 * Esta clase extiende directamente de la interfaz Runnable.
 */
public class CajeraRunneable implements Runnable {
    private Cliente cliente;

    public CajeraRunneable(Cliente cliente){
        this.cliente = cliente;
    }
    @Override
    public void run() {
        long init = System.currentTimeMillis();
        int[] cesta = cliente.getCestaDeLaCompra();
        for (int producto : cesta) {
            try {
                System.out.println("La cajara " +Thread.currentThread().getName() + " procesa el producto del cliente " + cliente.getNombre() + " en " + producto + " sec ");
                Thread.sleep(producto * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long fin = System.currentTimeMillis();
        System.out.println("La cajera " +Thread.currentThread().getName() +(fin - init)/1000 + " Segundos");

    }
}
