package com.example.eval_final_mod4;

public class Libro {
    private String titulo;
    private String autor;
    private String descripcion;
    private int imagenResId;
    private int precio;

    public Libro(String titulo,String autor, String descripcion, int imagenResId, int precio) {
        this.titulo = titulo;
        this.autor= autor;
        this.descripcion = descripcion;
        this.imagenResId = imagenResId;
        this.precio=precio;
    }





    public int getPrecio() {return precio;}
    public String getAutor() {return autor;}
    public int getImagenResId() {return imagenResId;}
    public String getDescripcion() {return descripcion;}
    public String getTitulo() {return titulo;}



    public void setPrecio(int precio) {this.precio = precio;}
    public void setImagenResId(int imagenResId) {this.imagenResId = imagenResId;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setAutor(String autor) {this.autor = autor;}
}
