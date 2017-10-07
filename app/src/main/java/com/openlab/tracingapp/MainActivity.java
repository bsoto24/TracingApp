package com.openlab.tracingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /*Declarando nuestras variables*/
    private TextView tvDireccion, tvEstado, tvCelular, tvCosto, tvCapacidad;
    private Button btnHome;
    private Estacionamiento estacionamiento1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Conectando nuestras vistas XML con sus respectivos objetos JAVA*/
        tvDireccion = (TextView) findViewById(R.id.tv_direccion);
        tvEstado = (TextView) findViewById(R.id.tv_estado);
        tvCelular = (TextView) findViewById(R.id.tv_celular);
        tvCosto = (TextView) findViewById(R.id.tv_costo);
        tvCapacidad = (TextView) findViewById(R.id.tv_capacidad);
        btnHome = (Button) findViewById(R.id.btn_home);

        /*Creando un objeto de tipo Estacionamiento*/
        estacionamiento1 = new Estacionamiento("Av. Venezuela 123","S/10.00 x hora", "Disponible", "10 de 20", "9991234123");

        /*Cambiando los textos de las vistas mediante código JAVA*/
        tvDireccion.setText(estacionamiento1.getDireccion());
        tvCelular.setText(estacionamiento1.getCelular());
        tvCosto.setText(estacionamiento1.getCosto());
        tvCapacidad.setText(estacionamiento1.getCapacidad());
        tvEstado.setText(estacionamiento1.getEstado());

        /*Escuchando el click del botón btnHome*/
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Código que se ejecuta al dar click al botón*/
            }
        });
    }
}
