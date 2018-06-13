/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoCerditos;

import Equipo.*;
/**
 *
 * @author Sophi
 */
public class EquipoCerditosFactory implements EquipoFactory {
    
    @Override
    public EquipoCerditos getEquipoCerditos(int opcion){
        // jugador escige cual desea ocupar para x accion
        switch(opcion){
            case 1:
                return new Cerditos();
            case 2:
                return new Supertunco();
        }
        return null;
    }
    
    @Override 
    public EquipoPrincesas getEquipoPrincesas(int opcion){
        return null;
    }
    
    @Override 
    public EquipoEsqueletos getEquipoEsqueletos(int opcion){
        return null;
    }
    
}
