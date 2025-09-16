package com.example.eval_final_mod4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eval_final_mod4.databinding.FragmentDescripcionBinding;

import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.LibroViewHolder> {


    private final List<Libro> listaLibros;

    public LibroAdapter(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @NonNull
    @Override
    public LibroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_libro, parent, false);
        return new LibroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LibroViewHolder holder, int position) {
        Libro libro = listaLibros.get(position);
        holder.titulo.setText(libro.getTitulo());
        holder.autor.setText(libro.getAutor());
        holder.imagen.setImageResource(libro.getImagenResId());

        holder.botonAgregar.setOnClickListener(v -> {
            CarritoManager.getInstance().addCarrito(
                    new Carrito(libro.getTitulo(), libro.getAutor(), libro.getPrecio(),libro.getImagenResId())
            );

            // Show a quick confirmation message (a Toast)
            Toast.makeText(v.getContext(), "Libro agregado al carrito", Toast.LENGTH_SHORT).show();
        });

        View.OnClickListener navegacionClickListener = v -> {
            Bundle args = new Bundle();
            args.putString("titulo", libro.getTitulo());
            args.putString("autor", libro.getAutor());
            args.putString("descripcion", libro.getDescripcion());
            args.putInt("imagen_id", libro.getImagenResId());

            Navigation.findNavController(v).navigate(R.id.descripcionfragment, args);
        };

        // Asigna el mismo listener a la imagen, el título y el autor
        holder.imagen.setOnClickListener(navegacionClickListener);
        holder.titulo.setOnClickListener(navegacionClickListener);
        holder.autor.setOnClickListener(navegacionClickListener);
    }

    @Override
    public int getItemCount() {
        return listaLibros.size();
    }

    public static class LibroViewHolder extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView titulo;
        TextView descripcion, autor;
        Button botonAgregar;

        public LibroViewHolder(@NonNull View itemView) {
            super(itemView);
            // Inicializa todas las vistas en una sola pasada para mayor claridad
            imagen = itemView.findViewById(R.id.imagenLibro);
            titulo = itemView.findViewById(R.id.tituloLibro);
            //descripcion = itemView.findViewById(R.id.descripcionLibro);
            autor = itemView.findViewById(R.id.autorLibro);
            botonAgregar = itemView.findViewById(R.id.btnAgregarCarrito);
        }
    }
}
