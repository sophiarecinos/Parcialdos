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
public interface Princesas {
    public void crearRecursos();
    public void crearEntrenamiento();
    public void crearCentroMando();
    public void crearVehiculo();
    public Recursos getInstance();
    public CentroMando getInstanceB();
    public Entrenamiento getInstanceC();
    public Vehiculo getInstanceD();
}
