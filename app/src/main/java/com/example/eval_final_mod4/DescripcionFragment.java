package com.example.eval_final_mod4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.eval_final_mod4.databinding.FragmentDescripcionBinding;


public class DescripcionFragment extends Fragment {
    private String titulo,autor,descripcion;
    private int imagen;
    private static final String ARG_TITULO = "titulo";
    private static final String ARG_AUTOR = "autor";
    private static final String ARG_DESCRIPCION = "descripcion";
    private static final String ARG_IMAGEN = "imagen";
    FragmentDescripcionBinding binding;

    public DescripcionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Correctly initialize the binding object and inflate the layout
        binding = FragmentDescripcionBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String TAG = "MiApp"; // PARA filtrar tus mensajes

        // recibe args aqui, despues de que el view sea creado
        Bundle args = getArguments();
        if (args != null) {
            titulo = args.getString("titulo");
            autor = args.getString("autor");
            descripcion = args.getString("descripcion");
            imagen = args.getInt("imagen_id");
            //usado para ver errores null
            Log.i(TAG, "El titulo del libro es: " + titulo);
            // Set the views using the binding object
            if (titulo != null) {
                binding.tituloLibro.setText(titulo);
            }
            if (autor != null) {
                binding.autorLibro.setText(autor);
            }
            if (descripcion != null) {
                binding.descripcionLibro.setText(descripcion);
            }
            if (imagen != 0) {
                binding.imagenLibro.setImageResource(imagen);
            }
        }


        ImageButton backButton = view.findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> {
            // PARA VOLVER
            Navigation.findNavController(v).popBackStack();
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding=null;
    }
}