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

import com.example.eval_final_mod4.databinding.FragmentLibrosBinding;

import java.util.ArrayList;
import java.util.List;

public class LibrosFragment extends Fragment {
    FragmentLibrosBinding binding;
    private RecyclerView recyclerView;
    private LibroAdapter adapter;
    private List<Libro> listaLibros;

    public LibrosFragment() {
        // Constructor vacío requerido por los fragmentos
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el layout del fragmento y retorna la vista raíz
        return inflater.inflate(R.layout.fragment_libros, container, false);

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Aquí llamas a tu método para inicializar el RecyclerView.
        initReciclerView(view);
    }
    private void initReciclerView(View view) {
        // Encuentra el RecyclerView usando la vista del fragmento.
        recyclerView = view.findViewById(R.id.recicladorlibros);

        // Configura el LayoutManager y el adaptador.
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Inicializa la lista de datos y el adaptador.
        listaLibros = new ArrayList<>();
        adapter = new LibroAdapter(listaLibros);
        recyclerView.setAdapter(adapter);

        // Llena la lista con datos.
        initDatosLibros();

    }
    private void initDatosLibros() {
        listaLibros.add(new Libro("1984","George Orwell","Una novela distópica que advierte sobre los peligros de los regímenes totalitarios y el control del pensamiento.",R.drawable.mil984,13000));
        listaLibros.add(new Libro("Orgullo y prejuicio","Jane Austen","Una novela que explora las relaciones sociales y el amor en el siglo XIX inglés. ",R.drawable.orgullo,9000));
        listaLibros.add(new Libro("La Divina Comedia","Dante Alighieri","Un poema épico monumental que narra un viaje a través del infierno, el purgatorio y el paraíso.",R.drawable.ldc,7000));
        listaLibros.add(new Libro("El Principito","Antoine de Saint-Exupéry","Un clásico que, con su aparente simplicidad, reflexiona sobre la vida, la amistad y la pérdida de la inocencia.",R.drawable.elprincipito,6000));
        listaLibros.add(new Libro("Frankenstein","Mary Shelley","Considerada la primera novela de ciencia ficción, aborda la responsabilidad de la creación y la identidad.",R.drawable.frank,11000));
        listaLibros.add(new Libro("Cien años de soledad","Gabriel García Márquez","Una obra maestra del realismo mágico y uno de los pilares del Boom Latinoamericano.",R.drawable.cien,3));
        listaLibros.add(new Libro("Crimen y castigo","Fiódor Dostoyevski","Un análisis psicológico del bien y el mal a través del dilema de un estudiante que comete un asesinato.",R.drawable.crimen,3));
        listaLibros.add(new Libro("Madame Bovary","Gustave Flaubert","Una novela que critica la hipocresía de la sociedad burguesa a través de la insatisfacción de su protagonista.",R.drawable.madamebovary,3));
        listaLibros.add(new Libro("Rayuela","Julio Cortázar","Una obra innovadora que rompe con las estructuras narrativas tradicionales y propone múltiples lecturas.",R.drawable.rayuela,3));
        listaLibros.add(new Libro("Don Quijote de la Mancha","Miguel de Cervantes","Una sátira de los libros de caballería que se convierte en una reflexión profunda sobre la locura y la identidad.",R.drawable.donquijote,3));
        listaLibros.add(new Libro("Los miserables","Victor Hugo","Una epopeya sobre la redención, la justicia y la lucha contra la pobreza en la Francia del siglo XIX.",R.drawable.los_miserables,3));
        listaLibros.add(new Libro("Fahrenheit 451","Ray Bradbury","Una distopía sobre una sociedad en la que los libros están prohibidos y la información es controlada.",R.drawable.fahrenheit451,3));
        listaLibros.add(new Libro("El extranjero","Albert Camus","Una exploración existencial sobre la indiferencia y la falta de sentido en la vida moderna.",R.drawable.elextranjero,3));
        listaLibros.add(new Libro("Matar a un ruiseñor","Harper Lee","Una crítica al racismo y la injusticia social en el sur de Estados Unidos durante la Gran Depresión.",R.drawable.ruisenor,3));
        listaLibros.add(new Libro("Ulises","James Joyce","Una obra monumental que retrata un solo día en Dublín con un estilo experimental y profundamente simbólico.",R.drawable.ulises,3));
        listaLibros.add(new Libro("Drácula","Bram Stoker","Una novela gótica que dio forma definitiva al mito moderno del vampiro.",R.drawable.dracula,3));
        listaLibros.add(new Libro("El gran Gatsby","F. Scott Fitzgerald","Un retrato crítico del sueño americano y la superficialidad de la alta sociedad en los años 20.",R.drawable.gatsby,3));
        adapter.notifyDataSetChanged();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding=null;
    }
}