/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussines;

import Data.*;
import UI.*;
import java.util.Scanner;

/**
 *
 * @author alejomarin
 */
public class TiendaMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Perro perro1 = new Perro("tito", "Concentrado", "2 meses", true, "blanco", "french poodle", "jugar", "compañia");
        Gato gato1 = new Gato("felix", "atun", "1 mes", true, "negro", "persa", true, "macho");
        Arana arana1 = new Arana("Charlote", "moscas", "1 mes", true, "lugar abrigado y oscuro", true, false, 1000);
        Pez pez1 = new Pez("nemo", "algas", "desconocida", true, "acuario", "salada", "pequeño", "pez payaso");
        Mono mono1 = new Mono("George", "frutas", "5 meses", true, "cafe", false, true, "poca");
        Pajaro pajaro1 = new Pajaro("Blue", "semillas", "10 meses", true, "jaula", true, false, false);
        Interfaz.PrintWelcome();
        Interfaz.PrintMainMenu();

        boolean Quit = false;

       

    }

}
