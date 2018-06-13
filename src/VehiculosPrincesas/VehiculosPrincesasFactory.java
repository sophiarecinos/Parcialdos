/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosPrincesas;

import Vehiculos.*;
/**
 *
 * @author Sophi
 */
public class VehiculosPrincesasFactory implements VehiculosFactory{
    
    @Override 
    public VehiculosPrincesas getVehiculosPrincesas(int opcion){
        //opciones 
        switch(opcion){
            case 1:
                return new Carruaje();
            case 2:
                return new Bote();
        }
        return null;
    }
     
    @Override 
    public VehiculosEsqueletos getVehiculosEsqueletos(int opcion){
        return null;
    }
    
    @Override 
    public VehiculosCerditos getVehiculosCerditos(int opcion){
        return null;
    }
    
}
