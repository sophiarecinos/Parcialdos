/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionCerditos;
import Razas.*;
import Razas.Recursos;
/**
 *
 * @author Sophi
 */
public class Cultivos implements Cerditos{
    public static Recursos edificacion = new Recursos();
    public void crearEdificacionRecursos() {
        System.out.println("Guardar granos");
        edificacion.setRaza("Cerditos");
        edificacion.setMonto(200);
        edificacion.setVida(900);
        edificacion.setCapacidad(1000);
        edificacion.setTiempo(2);
    }
    @Override 
    public Recursos getInstance(){
        return this.edificacion;
    }
    @Override 
    public CentroMando getInstanceB(){
        return null;
    }
    @Override 
    public Entrenamiento getInstanceC(){
        return null;
    }
    @Override 
    public Vehiculo getInstanceD(){
        return null;
    }
    @Override
    public void crearRecursos(){}
    @Override
    public void crearEntrenamiento(){}
    @Override
    public void crearCentroMando(){}
    @Override 
    public void crearVehiculo(){}

    
    
    
}
