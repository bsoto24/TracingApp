package com.openlab.tracingapp;

/**
 * Created by Bryam Soto on 06/10/2017.
 */

public class Estacionamiento {

    private String direccion;
    private String costo;
    private String estado;
    private String capacidad;
    private String celular;


    public Estacionamiento(String direccion, String costo, String estado, String capacidad, String celular) {
        this.direccion = direccion;
        this.costo = costo;
        this.estado = estado;
        this.capacidad = capacidad;
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}