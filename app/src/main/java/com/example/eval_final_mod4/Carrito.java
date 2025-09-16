package com.example.eval_final_mod4;

public class Carrito {
    private String titulo;
    private String autor;
    private int precio;
    private  int getImagenResId;

    public Carrito(String titulo, String autor, int precio,int getImagenResId) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getPrecio() { return precio; }
    public int getImagenResId() {return getImagenResId;}
}
