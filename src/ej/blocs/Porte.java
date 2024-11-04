package ej.blocs;

import com.sun.jdi.VoidValue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.PorteVerrouilleeException;
import ej.exceptions.IllegalBlocException;
import java.util.function.Predicate;

public class Porte extends Bloc{

    private static Logger logger = LogManager.getLogger(Porte.class);
    
    private boolean verrouillee;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouillee) throws IllegalBlocException{
        super(longueur, largeur, hauteur, Couleur.BLEU);
        this.verrouillee = verrouillee;
    }

    public void verouiller() throws PorteVerrouilleeException{
        if (!verrouillee) {
            verrouillee=true;}
        else {
            logger.error("Porte déjà verrouillée. Elle ne peut l'être à nouveau");
            throw new PorteVerrouilleeException();}
    }

    public boolean estVerrouillee(){
        return verrouillee;
    }

    public void forcerSerrure(Predicate<String> fonction){
        String cleSecrete = "#secret123";
        if(this.verrouillee){
            if(fonction.test(cleSecrete)){
                this.verrouillee=false;
            }
        }
    }

}
