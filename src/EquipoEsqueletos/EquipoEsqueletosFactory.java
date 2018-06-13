/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EquipoEsqueletos;

import Equipo.*;
/**
 *
 * @author Sophi
 */
public class EquipoEsqueletosFactory implements EquipoFactory {
    
    @Override
    public EquipoEsqueletos getEquipoEsqueletos(int opcion){
        // opciones y switch
        switch(opcion){
            case 1:
                return new Esqueletitos();
            case 2:
                return new Superhumano();
        }
        return null;
    }
    
    @Override
    public EquipoPrincesas getEquipoPrincesas(int opcion){
        return null;
    }
    
    @Override
    public EquipoCerditos getEquipoCerditos(int opcion){
        return null;
    }
}
