/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosEsqueletos;
import Vehiculos.*;
/**
 *
 * @author Sophi
 */
public class VehiculosEsqueletosFactory implements VehiculosFactory{
    
    @Override
    public VehiculosEsqueletos getVehiculosEsqueletos(int opcion){
        // opciones 
        switch(opcion){
            case 1:
                return new Navecita();
            case 2:
                return new Bicicleta();
        }
        return null;
    }
    
    @Override
    public VehiculosPrincesas getVehiculosPrincesas(int opcion){
        return null;
    }
    
    @Override
    public VehiculosCerditos getVehiculosCerditos(int opcion){
        return null;
    }
    
}
