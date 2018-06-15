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
    public void guardarEdificiosRecurso(int edificio, Player jugador){
        FactoryCerditos cerdos = new FactoryCerditos();
        FactoryEsqueletos esqueletos = new FactoryEsqueletos();
        FactoryPrincesas princesas = new FactoryPrincesas();
        switch(jugador.getRaza()){
            case 1:
                cerdos.getCerditos(edificio).crearRecursos();
                Recursos recurso2 = cerdos.getCerditos(edificio).getInstance(); 
                //jugador.getRecursos().add(recurso2);
                break;
              
            case 2:
                esqueletos.getEsqueletos(edificio).crearRecursos();
                Recursos recurso = esqueletos.getEsqueletos(edificio).getInstance();
                //jugador.getRecursos().add(recurso);
                break;
            case 3:
                princesas.getPrincesas(edificio).crearRecursos();
                Recursos recurso1 = princesas.getPrincesas(edificio).getInstance();
               // jugador.getRecursos().add(recurso1);
                break;
        }
    }
    public void guardarEdificioCentroMando(Player jugador){
        FactoryCerditos cerdos = new FactoryCerditos();
        FactoryEsqueletos esqueletos = new FactoryEsqueletos();
        FactoryPrincesas princesas = new FactoryPrincesas();
            switch(jugador.getRaza()){
                case 1:
                        cerdos.getCerditos(7).crearCentroMando();
                        CentroMando centroMando = cerdos.getCerditos(7).getInstanceB();
                        //jugador.getCentroMando().add(centroMando);
                        break;
                case 2:
                       esqueletos.getEsqueletos(7).crearCentroMando();
                       CentroMando centroMando1 = esqueletos.getEsqueletos(7).getInstanceB();
                       //jugador.getCentroMando().add(centroMando1);
                       break;
                case 3:
                    princesas.getPrincesas(7).crearCentroMando();
                    CentroMando centroMando2 = princesas.getPrincesas(7).getInstanceB();
                    //jugador.getCentroMando().add(centroMando2);
                    break;
            }
        }
 public void guardarEdificioMilicia(Player jugador){
        FactoryCerditos cerdos = new FactoryCerditos();
        FactoryEsqueletos esqueletos = new FactoryEsqueletos();
        FactoryPrincesas princesas = new FactoryPrincesas();
         switch(jugador.getRaza()){
             case 1:
                 
                break;
             case 2:
                 
                break;
             case 3:
                 
                break;
         }
    }
 public void guardarEdificioVehiculo(int edificio, Player jugador){
        FactoryCerditos cerdos = new FactoryCerditos();
        FactoryEsqueletos esqueletos = new FactoryEsqueletos();
        FactoryPrincesas princesas = new FactoryPrincesas();
         switch(jugador.getRaza()){
             case 1:
                
                break;
             case 2:
                
                break;
             case 3:
               
                break;
         }
    }
    public void guardarMilicia(int tipo, Player jugador){
        FactoryCerditos cerdos = new FactoryCerditos();
        FactoryEsqueletos esqueletos = new FactoryEsqueletos();
        FactoryPrincesas princesas = new FactoryPrincesas();
         switch(jugador.getRaza()){
             case 1:
               
                break;
             case 2:
                
                break;
             case 3:
               
                break;
         }
    }
    public void guardarVehiculo(int tipo , Player jugador){
        FactoryCerditos cerdos = new FactoryCerditos();
        FactoryEsqueletos esqueletos = new FactoryEsqueletos();
        FactoryPrincesas princesas = new FactoryPrincesas();
         switch(jugador.getRaza()){
             case 1:
               
                break;
             case 2:
         
                break;
             case 3:
                 break;
         }
    }

  
  
    
    }
  
    

