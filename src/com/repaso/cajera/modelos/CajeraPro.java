package com.repaso.cajera.modelos;

/**
 * Clase que extiende de {@link Thread} , en esta clase vamos a poder @override el metodo run y así crear los hilos
 * necesarios para que exista la concurrencia de datos.
 */
public class CajeraPro extends Thread {
    private String nombre;
    private Cliente cliente;

    public CajeraPro(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }

    /**
     * Metodo Run , ejecutamos los hilos para que exita concurrencia, creando tantos hilos como quermaos y así agilizar el proceso.
     *
     */
    @Override
    public void run() {
        long init = System.currentTimeMillis();
        int[] cesta = cliente.getCestaDeLaCompra();
        for (int producto : cesta) {
            try {
                System.out.println("La cajara " + nombre + " procesa el producto del cliente " + cliente.getNombre() + " en " + producto + " sec ");
                Thread.sleep(producto * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long fin = System.currentTimeMillis();
        System.out.println("El proceso a tardado en concluir" + (fin - init)/1000 + " Segundos");
    }

}
