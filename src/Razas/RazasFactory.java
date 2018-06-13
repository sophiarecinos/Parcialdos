/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author Sophi
 */
public interface RazasFactory {
    public Princesas getPrincesas(int option);
    public Esqueletos getEsqueletos(int option);
    public Cerditos getCerditos(int option);
    
}
