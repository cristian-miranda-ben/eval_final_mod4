package com.example.eval_final_mod4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eval_final_mod4.databinding.FragmentCarritoBinding;
import com.example.eval_final_mod4.databinding.FragmentLibrosBinding;

import java.util.ArrayList;
import java.util.List;

public class CarritoFragment extends Fragment {
    FragmentCarritoBinding binding;
    private RecyclerView recyclerView;
    private CarritoAdapter adapter;
    
    public CarritoFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 1. Infla el layout del fragmento y retorna la vista raíz usando el binding
        binding = FragmentCarritoBinding.inflate(inflater, container, false);
        return binding.getRoot(); // <-- Retorna la vista correcta aquí
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 1. Inicializa el RecyclerView y el adapter
        initReciclerView(view);

        adapter.notifyDataSetChanged();
    }



    private void initReciclerView(View view) {
        // Encuentra el RecyclerView usando la vista del fragmento.
        recyclerView = view.findViewById(R.id.recicladorcarrito);

        // Configura el LayoutManager y el adaptador.
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Inicializa el adaptador con la lista del Singleton.
        adapter = new CarritoAdapter(CarritoManager.getInstance().getListaCarrito());
        recyclerView.setAdapter(adapter);
        // Llama al metodo para actualizar los text views.
        actualizaTVs();

    }

    private void actualizaTVs() {
        if (adapter != null) {
            adapter.notifyDataSetChanged();

            int totalPrecios = 0;
            for (Carrito item : adapter.getListaCarrito()) {
                totalPrecios += item.getPrecio();
            }
            int totalLibros = adapter.getItemCount();
            // Usa la cadena de recursos y el formato de String
            String textoTotalLibros = getString(R.string.total_libros, totalLibros);

            binding.tvCantidadCarrito.setText(textoTotalLibros);

            binding.tvTotalCarrito.setText(getString(R.string.total_precio, totalPrecios));
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding=null;
    }
}