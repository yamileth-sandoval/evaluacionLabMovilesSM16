package com.example.evaluacionlabmovilessm16;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import Entidades.Estudiante;

public class MainActivity extends AppCompatActivity {
    public static Estudiante itemEstudiante;
    public static List<Estudiante> listaEstudiantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.itemEstudiante=new Estudiante();
        this.listaEstudiantes=new ArrayList<>();
    }
    public void clickNuevoEstudiante(View v){
        Intent nuevo=new Intent(this, nuevoEstudiante.class);
        startActivity(nuevo);
    }
    public void clickListaEstudiante(View v){
        if(listaEstudiantes==null || listaEstudiantes.isEmpty()){
            Toast.makeText(this,"No hay elementos que mostrar",Toast.LENGTH_LONG).show();
        }else {
            Intent lista=new Intent(this, listaEstudiantes.class);
            startActivity(lista);
        }
    }
    public void clickMisDatos(View v){
        Intent misDatos=new Intent(this, misDatos.class);
        startActivity(misDatos);
    }
}
