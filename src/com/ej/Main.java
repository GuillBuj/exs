package ej;

public class Main {
    
    public static void main(String[] args) {
        /*Kit kitDeDemarrage = new Kit();
        kitDeDemarrage.afficherKit();*/
        Porte porte = new Porte(1, 1, 1, true);
        try {
            porte.verouiller();
        } catch (PorteVerrouilleeException e) {
            System.out.println("Porte déjà verrouillée");
        }
        
    }
    
}
