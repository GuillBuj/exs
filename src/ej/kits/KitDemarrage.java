package ej.kits;

/*import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;*/
import java.util.LinkedHashSet;
//import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.blocs.IBloc;
import ej.blocs.Mur;
import ej.blocs.Porte;
import ej.exceptions.IllegalBlocException;

/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.PublicKey;*/

public class KitDemarrage {

    private static Logger logger = LogManager.getLogger(KitDemarrage.class);

   /*  @SuppressWarnings("Convert2Diamond")
    List<IBloc> blocs = new ArrayList<IBloc>();
    @SuppressWarnings("Convert2Diamond")
    Set<String> motsCles = new HashSet<String>();*/

  
    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
	private Set<String> motsCles = new LinkedHashSet<>();

    public KitDemarrage() throws IllegalBlocException {
        this.blocs.add(new Mur(3,2,2,true));
        this.blocs.add(new Mur(3,2,2,true));
        this.blocs.add(new Mur(2,1,2,false));
        this.blocs.add(new Mur(2,1,2,false));
        this.blocs.add(new Porte(3,2,2,true));

        motsCles.add("Cabane");
        motsCles.add("Muraille");
    }

    public KitDemarrage(final Set<IBloc> blocs) throws IllegalBlocException {
		this.blocs.addAll(blocs);

		motsCles.add("Cabane");
		motsCles.add("Muraille");
		motsCles.add("Maison");
	}


    public void afficherKit(){
        System.out.println("Nombre de blocs dans le kit:" + blocs.size());
        System.out.print("Liste des mots-clés du kit: ");
        
        /*for (Object motCle : motsCles) {                      //v1
            System.out.print(motCle + " ");
        }*/
        motsCles.forEach((motCle)->System.out.print(motCle + " ")); //v2
        //motsCles.forEach(System.out::print);                  //v3

        System.out.println("");
        }

/*    public void sauvegarder(){
        StringBuilder builder = new StringBuilder();
        builder.append("Kit de démarrage\n");
        for (String motCle : motsCles) {
            builder.append(motCle).append(" ");
        }

        try {
            BufferedWriter writer = new BufferedWriter("kit.txt");
            writer.write(builder.toString());
            writer.close();
        } catch (IOException e) {
        }
    }

    public void charger(){
        try (BufferedReader reader = new BufferedReader(new FileReader("kit.txt"))) {
            String line = null;
            while((line=reader.readLine())!=null) {System.out.println(line);}
        } catch(FileNotFoundException e){
            logger.error("Le fichier 'kit.txt n'existe pas");
        }
        catch (IOException e) {
            logger.error("Impossible de lire le fichier 'kit.txt'");
        }
    }*/ 

    public Set<IBloc> getBlocs() {
		return blocs;
	}
	
	public Set<String> getMotsCles() {
		return motsCles;
	}
}

    


