/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionCerditos;

import Razas.*;
/**
 *
 * @author Sophi
 */
public class FactoryCerditos implements RazasFactory{
    
    @Override
    public Esqueletos getEsqueletos(int option){
        return null;
    }
    
    @Override
    public Princesas getPrincesas(int option){
        return null;
    }
    
    @Override
    public Cerditos getCerditos(int option){
        switch(option){
            case 1:
                return new Cultivos();
            case 2:
                return new TierraMojada();
            case 3: 
                return new TocinoMaker();
            case 4: 
                return new EntrenamientoC();
            case 5:
                return new LlantasMaker();
            case 6:
                return new MotoTaller();
        }
       return null;
    }

}
