/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoPrincesas;

import Equipo.*;
/**
 *
 * @author Sophi
 */
public class EquipoPrincesasFactory implements EquipoFactory{
    
    @Override
    public EquipoPrincesas getEquipoPrincesas(int opcion){
        //dar opciones
        switch(opcion){
            case 1:
                return new Honguitos();
            case 2:
                return new Superhonguito();
        }
        return null;
    }
    
    @Override
    public EquipoCerditos getEquipoCerditos(int opcion){
        return null;
    }
    
    @Override 
    public EquipoEsqueletos getEquipoEsqueletos(int opcion){
        return null;
    }
    
}
