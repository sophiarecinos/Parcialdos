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
    
}
