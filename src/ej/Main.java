package ej;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.blocs.Porte;


public class Main {
    
    private static Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        
        logger.error("Test de logging");
        
        try {
            Porte porte = new Porte(0, 1, 1, true);
            porte.verouiller();
        } catch (IllegalBlocException e){
            System.out.println("Mauvaises dimensions du bloc");
        } catch (PorteVerrouilleeException e) {
            System.out.println("Porte déjà verrouillée");
        } 
        
    }
    
}
