package com.example.evaluacionlabmovilessm16;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import Entidades.Estudiante;

import static com.example.evaluacionlabmovilessm16.MainActivity.itemEstudiante;
import static com.example.evaluacionlabmovilessm16.MainActivity.listaEstudiantes;

public class nuevoEstudiante extends AppCompatActivity {
    private EditText txtNombre, txtCodigo, txtMateria;
    private EditText txtP1, txtP2, txtP3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_estudiante);
        //inicializar las variables
        this.txtNombre=findViewById(R.id.txtNombre);
        this.txtCodigo=findViewById(R.id.txtCodigo);
        this.txtMateria=findViewById(R.id.txtMateria);
        this.txtP1=findViewById(R.id.txtP1);
        this.txtP2=findViewById(R.id.txtP2);
        this.txtP3=findViewById(R.id.txtP3);
    }
    public void clickGuardar(View v){
        if(!sonEspacios(txtNombre.getText().toString()) && !sonEspacios(txtCodigo.getText().toString()) && !sonEspacios(txtMateria.getText().toString())){
            if(!sonEspacios(txtP1.getText().toString()) && !sonEspacios(txtP2.getText().toString()) && !sonEspacios(txtP3.getText().toString())){
                itemEstudiante.setNombre(this.txtNombre.getText().toString());
                itemEstudiante.setCodigo(this.txtCodigo.getText().toString());
                itemEstudiante.setMateria(this.txtMateria.getText().toString());
                itemEstudiante.setParcial1(Double.parseDouble(txtP1.getText().toString()));
                itemEstudiante.setParcial2(Double.parseDouble(txtP2.getText().toString()));
                itemEstudiante.setParcial3(Double.parseDouble(txtP3.getText().toString()));
                itemEstudiante.setId(listaEstudiantes.size()+1);
                itemEstudiante.setPromedio();
                listaEstudiantes.add(itemEstudiante);
                itemEstudiante = new Estudiante();
                Toast.makeText(this,"Estudiante registrado correctamente",Toast.LENGTH_LONG).show();
                finish();
            }else {
                Toast.makeText(this,"No pueden haber campos vacios",Toast.LENGTH_LONG).show();
            }
        }else {
            Toast.makeText(this,"No pueden haber campos vacios",Toast.LENGTH_LONG).show();
        }
    }

    private boolean sonEspacios(String cad){
        boolean res=true;
        for (int i=0; i<cad.length();i++){
            if(cad.charAt(i) != ' '){
                res=false;
            }
        }
        return res;
    }
}
