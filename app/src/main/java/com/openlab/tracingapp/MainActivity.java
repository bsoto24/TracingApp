package com.openlab.tracingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDireccion, tvEstado, tvCelular, tvCosto, tvCapacidad;
    private Estacionamiento estacionamiento1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDireccion = (TextView) findViewById(R.id.tv_direccion);
        tvEstado = (TextView) findViewById(R.id.tv_estado);
        tvCelular = (TextView) findViewById(R.id.tv_celular);
        tvCosto = (TextView) findViewById(R.id.tv_costo);
        tvCapacidad = (TextView) findViewById(R.id.tv_capacidad);

        estacionamiento1 = new Estacionamiento("Av. Venezuela 123","S/10.00 x hora", "Disponible", "10 de 20", "9991234123");

        tvDireccion.setText(estacionamiento1.getDireccion());
        tvCelular.setText(estacionamiento1.getCelular());
        tvCosto.setText(estacionamiento1.getCosto());
        tvCapacidad.setText(estacionamiento1.getCapacidad());
        tvEstado.setText(estacionamiento1.getEstado());
    }
}
