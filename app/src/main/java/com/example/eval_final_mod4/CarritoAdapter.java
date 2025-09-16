package com.example.eval_final_mod4;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CarritoAdapter extends RecyclerView.Adapter<CarritoAdapter.CarritoViewHolder>{

    private final List<Carrito> listaCarrito;

    public CarritoAdapter(List<Carrito> listaCarrito){
        this.listaCarrito = listaCarrito;
    }

    @NonNull
    @Override
    public CarritoAdapter.CarritoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_libro_carrito, parent, false);

        return new CarritoAdapter.CarritoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarritoAdapter.CarritoViewHolder holder, int position) {
        Carrito carrito = listaCarrito.get(position);
        holder.titulo.setText(carrito.getTitulo());
        holder.autor.setText(carrito.getAutor());
        holder.imagen.setImageResource(carrito.getImagenResId());
        holder.precio.setText(String.valueOf(carrito.getPrecio()));

    }

    @Override
    public int getItemCount() {

        return listaCarrito.size();
    }
    public List<Carrito> getListaCarrito() {
        return listaCarrito;
    }
    public static class CarritoViewHolder extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView titulo,autor,precio;
        public CarritoViewHolder(@NonNull View itemView) {
            super(itemView);
            // Inicializa todas las vistas en una sola pasada para mayor claridad

            imagen = itemView.findViewById(R.id.iv_carrito_imagen);
            titulo = itemView.findViewById(R.id.tv_carrito_titulo);
            autor = itemView.findViewById(R.id.tv_carrito_autor);
            precio=itemView.findViewById(R.id.tv_carrito_precio);
        }
    }
}
