/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;
/**
 *
 * @author Sophi
 */
public class Menu {
    Player p1 = Player.getInstance();
    Player p2 = Player.getInstance();
    Scanner in = new Scanner(System.in);
    public void MenuUno(){
        //int opcion = 0;
        
        //System.out.println("--------------------------------------");
        System.out.println("------ SOPHIA RECINOS WORLD -------");
        //System.out.println("--------------------------------------");
        System.out.println("Bienvenidos a Sophia Recinos' World, preparate para vivir la mejor experiencia en este juego de combate.");
         int raza;
        System.out.println("-----------Jugador 1--------------------");
        System.out.println("Escoga una raza: ");
        System.out.println("1. Princesas");
        System.out.println("2. Cerditos");
        System.out.println("3. Esqueletos");
        System.out.println("--------------------------------------");
        raza=in.nextInt();
        p1.setRaza(raza);
        p1.setNum(1);
        //p1.guardarCentroMando(raza);
        //System.out.println(p1.getRaza());
        System.out.println("-----------Jugador 2--------------------");
        System.out.println("Escoga una raza: ");
        System.out.println("1. Princesas");
        System.out.println("2. Cerditos");
        System.out.println("3. Esqueletos");
        System.out.println("--------------------------------------");
        raza=in.nextInt();
        p2.setRaza(raza);
        p2.setNum(2);
        //p2.guardarCentroMando(raza);   
       
        
    }
    public void MenuDos(){
        int opcion = 0;
        int cont = 0;
        while(opcion!=4){
            if((cont%2)==0)
                System.out.println("----------Jugador 1---------------------");
            else
                System.out.println("----------Jugador 2---------------------");
            
            //System.out.println("----------Jugador A---------------------");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Modificar/ver mis edificaciones");
            System.out.println("2. Atacar contrincante");
            System.out.println("3. Defender mi territorio");
            System.out.println("4. Acabar turno");
            opcion=in.nextInt();
            
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                case 3:
                case 4: 
                    opcion=0;
            }
            cont++;
            
        }
    }
        public void MenuEdificaciones(Player p){
        int opcion = 0;
        Player p2 = new Player();
        Scanner input = new Scanner(System.in);
        while(opcion!=7){
        System.out.println("----------Creando---------------------");
        System.out.println("1. Crear recurso uno");
        System.out.println("2. Crear recurso dos");
        System.out.println("3. Crear recurso tres");
        System.out.println("4. Crear Equipo");
        System.out.println("5. Crear vehiculo uno");
        System.out.println("6. Crear vehiculo dos");
        System.out.println("7. Regresar");
        opcion=input.nextInt();
        switch(opcion){
            case 1:
                p2.guardarEdificiosRecurso(opcion, p);
                break;
            case 2:
                p2.guardarEdificiosRecurso(opcion, p);
                break;
            case 3:
                p2.guardarEdificiosRecurso(opcion, p);
                break;
            case 4:
                p2.guardarEdificioMilicia(p);
                break;
            case 5:
                p2.guardarEdificioVehiculo(opcion, p);
                break;
            case 6: 
                p2.guardarEdificioVehiculo(opcion, p);
                break;
            case 7:
                MenuDos();
                break;
        }
        
        }
    }
        
       
        
    }
    

