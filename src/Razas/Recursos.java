/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author Sophi
 */
public class Recursos {
    public int costo, vida, monto, capacidad, tiempo;
    public String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMonto(int monto) {
        this.monto=monto;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad=capacidad;
    }

    public void setTiempo(int tiempo) {
        this.tiempo=tiempo;
    }
    
    
}
