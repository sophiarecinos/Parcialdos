/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosCerditos;

import Vehiculos.*;
/**
 *
 * @author Sophi
 */
public class VehiculosCerditosFactory implements VehiculosFactory{
    
    @Override
    public VehiculosCerditos getVehiculosCerditos(int opcion){
        //switch y crear
        switch(opcion){
            case 1:
                return new Llantas();
            case 2:
                return new Moto();
        }
        return null;
    }
    
    @Override 
    public VehiculosPrincesas getVehiculosPrincesas(int opcion){
        return null;
    }
    
    @Override
    public VehiculosEsqueletos getVehiculosEsqueletos(int opcion){
        return null;
    }
    
}
