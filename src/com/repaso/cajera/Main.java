package com.repaso.cajera;

import com.repaso.cajera.modelos.Cajera;
import com.repaso.cajera.modelos.CajeraPro;
import com.repaso.cajera.modelos.CajeraRunneable;
import com.repaso.cajera.modelos.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(new int[]{1,2,3,4,5}, "Cliente001");
        Cliente cliente2 = new Cliente(new int[]{12,14,17,3},"Cliente002");

        List<Cliente>  listaClientes = new ArrayList<>();
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(new Cliente(new int[] {32,43,4,5,67},"Cliente 3"));
        listaClientes.add(new Cliente(new int[] {2,34,43,5,67},"Cliente 4"));
        listaClientes.add(new Cliente(new int[] {2,23,4,54,67},"Cliente 5"));
        listaClientes.add(new Cliente(new int[] {2,3,4,5,72},"Cliente 6"));
        /**
         * Los  hilos haacen un pull y procesan cada cliente de la lista.
         */
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (Cliente cliente: listaClientes){
            CajeraRunneable cajera = new CajeraRunneable(cliente);
            executorService.execute(cajera);
        }

        //Cajera cajera1 = new Cajera("Cajera1");
        //Cajera cajera2 = new Cajera("Cajera2");
       // CajeraPro cajeraPro1 = new CajeraPro("CajeraPro1", cliente1);
       // CajeraPro cajeraPro2 = new CajeraPro("CajeraPro2", cliente2);


        long init = System.currentTimeMillis();


        //cajera1.procesarCompra(cliente1);
        //cajera2.procesarCompra(cliente2);
       // cajeraPro1.start();
       // cajeraPro2.start();

        long fin = System.currentTimeMillis();
        System.out.println("El proceso a tardado en concluir" + (fin - init)/1000 + " Segundos");
    }
}
