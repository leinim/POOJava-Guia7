/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poomanosalaobra;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Mile
 */
public class POOManosALaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona primeraPersona = new Persona();
        Persona segundaPersona = new Persona("Milena");

        primeraPersona.setNombre("Guillermina");
        segundaPersona.getNombre();

        primeraPersona.edad = 26;
        primeraPersona.peso = 40;
    }

}
