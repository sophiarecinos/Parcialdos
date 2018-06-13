/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Sophi
 */
public interface VehiculosFactory {
    public VehiculosPrincesas getVehiculosPrincesas(int option);
    public VehiculosEsqueletos getVehiculosEsqueletos(int option);
    public VehiculosCerditos getVehiculosCerditos(int option);
    
}
