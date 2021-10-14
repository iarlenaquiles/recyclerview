package com.aquiles.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.aquiles.recyclerview.R;
import com.aquiles.recyclerview.adapter.Adapter;
import com.aquiles.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerLista;
    private List<Filme>  listaFilmes = new ArrayList<Filme>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerLista = findViewById(R.id.recyclerLista);
        recyclerLista.setHasFixedSize(true);
        recyclerLista.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        // criar filmes
        this.criarFilmes();

        // configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        // configurar recycler view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerLista.setLayoutManager(layoutManager);
        recyclerLista.setAdapter(adapter);

    }

    public void criarFilmes() {
        Filme filme = new Filme("Homem aranha", "Aventura", "2021");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Liga da justiça", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Capitao america", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("It a coisa", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Shrek", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Shrek", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Shrek", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Shrek", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Shrek", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Shrek", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Shrek", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Shrek", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Shrek", "genero", "ano");
        this.listaFilmes.add(filme);

        filme = new Filme("Shrek", "genero", "ano");
        this.listaFilmes.add(filme);
    }
}