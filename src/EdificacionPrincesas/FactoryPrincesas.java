/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionPrincesas;

import Razas.*;
/**
 *
 * @author Sophi
 */
public class FactoryPrincesas implements RazasFactory{
    
    @Override
    public Esqueletos getEsqueletos(int option){
        return null;
    }
    
    @Override
    public Princesas getPrincesas(int option){
        //dar opciones para crear edificaciones con switch y validando recursos
        return null;
    }
    
    @Override
    public Cerditos getCerditos(int option){
        return null;
    }
     
}
