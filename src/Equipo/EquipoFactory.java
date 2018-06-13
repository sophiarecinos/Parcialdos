/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipo;

/**
 *
 * @author Sophi
 */
public interface EquipoFactory {
    public EquipoPrincesas getEquipoPrincesas(int option);
    public EquipoEsqueletos getEquipoEsqueletos(int option);
    public EquipoCerditos getEquipoCerditos(int option);
}
