package com.example.eval_final_mod4;

import java.util.ArrayList;
import java.util.List;

public class CarritoManager {
    // SINGLETON PARA ALMACENAR DATOS DE RECYCLER LIBROS A RECYCLER CARRITO
    // SE QUE ES MALA PRACTICA PERO NO HEMOS USADO LOS VIEWMODELS Y NO SE USARLOS TAMPOCO JAJA
    private static CarritoManager instance;
    private final List<Carrito> listaCarrito = new ArrayList<>();

    private CarritoManager() {
        // Constructor privado para evitar instanciación
    }

    public static synchronized CarritoManager getInstance() {
        if (instance == null) {
            instance = new CarritoManager();
        }
        return instance;
    }

    public List<Carrito> getListaCarrito() {
        return listaCarrito;
    }

    public void addCarrito(Carrito carrito) {
        listaCarrito.add(carrito);
    }
}