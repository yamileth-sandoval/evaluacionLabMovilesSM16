package com.example.evaluacionlabmovilessm16;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import Adaptadores.adaptadorEstudiante;

import static com.example.evaluacionlabmovilessm16.MainActivity.listaEstudiantes;
public class listaEstudiantes extends AppCompatActivity {
    ListView lstLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);

        this.lstLista=findViewById(R.id.lstLista);
        this.lstLista.setAdapter(new adaptadorEstudiante(this,R.layout.plantilla_lista,listaEstudiantes));
    }
}
