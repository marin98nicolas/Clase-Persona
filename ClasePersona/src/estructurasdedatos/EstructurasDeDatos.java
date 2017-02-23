/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import Persona.Persona;

/**
 *
 * @author camila
 */
public class EstructurasDeDatos {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Persona juan = new Persona();
        
        juan.setNombre("Juan Perez");
        juan.setDireccion("Cra 23");
        juan.setTelefono("3333333");
        
        System.out.println("Nombre: " + juan.getNombre() +
                "\nCedula: " + juan.getCedula() +
                "\nDireccion: " + juan.getDireccion() +
                "\nTelefono: " + juan.getTelefono());
        
        
        
        
        
    }
    
}
