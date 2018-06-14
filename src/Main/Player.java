/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Razas.*;
import EdificacionCerditos.FactoryCerditos;
import EdificacionPrincesas.FactoryPrincesas;
import EdificacionEsqueletos.FactoryEsqueletos;

/**
 *
 * @author Sophi
 */
public class Player {
    private static Player usuario = new Player();
    private int raza, num;
    FactoryPrincesas princesa = new FactoryPrincesas();
    FactoryCerditos cerdito = new FactoryCerditos();
    FactoryEsqueletos unaited = new FactoryEsqueletos();

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    
    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
        
    }
    
    public static Player getInstance(){
        if(usuario==null){
            usuario=new Player();
        }
        return usuario;
    }

    
    }
  
    

