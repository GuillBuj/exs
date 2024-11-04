package ej;


import ej.blocs.IBloc;
import ej.blocs.Mur;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.blocs.Porte;
import ej.blocs.Toit;
import ej.blocs.TypeBloc;
import ej.exceptions.IllegalBlocException;
import ej.kits.KitDemarrage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Main {
    
    private static Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) throws IOException {
        
    /*     logger.error("Test de logging");
        
       try {
            Porte porte = new Porte(1, 1, 1, true);
            porte.verouiller();
        } catch (IllegalBlocException e){
            System.out.println("Mauvaises dimensions du bloc");
        } catch (PorteVerrouilleeException e) {
            System.out.println("Porte déjà verrouillée");
        } 
     */
    
    logger.error("INFO - Lancement du programme Epicrafter's Journey.");

     try {
        KitDemarrage kit = new KitDemarrage(constructionSetBlocs());
     //   kit.sauvegarder();
        kit.afficherKit();
     System.out.println("Vous possedez un kit de démarrage!");
     System.out.println("Que souhaitez-vous afficher?\n\t1 - Les idées de construction \n\t2 - Le nombre de blocs ' chaque type de blocs présents dans le kit");
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String reponse = reader.readLine();
        switch (reponse) {
            case "1":
                Set<String> motsCles = kit.getMotsCles();
                System.out.println("Idées de construction:");
                motsCles.forEach(System.out::println);
                break;
            case "2":
                Map<TypeBloc, Integer> qteBlocs= new TreeMap<TypeBloc, Integer>();
                /*for(IBloc bloc : kit.getBlocs()){
                    TypeBloc typeBloc = TypeBloc.valueOf(bloc.getClass().getSimpleName().toUpperCase());;
                    int qte = qteBlocs.getOrDefault(typeBloc, 0)+1;
                    qteBlocs.put(typeBloc, qte);
                }*/
                kit.getBlocs().forEach((bloc)->{
                    TypeBloc typeBloc = TypeBloc.valueOf(bloc.getClass().getSimpleName().toUpperCase());;
                    int qte = qteBlocs.getOrDefault(typeBloc, 0)+1;
                    qteBlocs.put(typeBloc, qte);
                }
                );
                Set<TypeBloc> typesBlocs = qteBlocs.keySet();
                /*for (TypeBloc typeBloc : typesBlocs) {
                    System.out.println(typeBloc.toString() + " " + qteBlocs.get(typeBloc));
                }*/
                typesBlocs.forEach((typeBloc) -> System.out.println(typeBloc.toString() + " " + qteBlocs.get(typeBloc)));
                break;
            default:
                System.out.println("Valeur saisie invalide - tapez 1 ou 2.");
                break;
        }
    } catch (IllegalBlocException e) {
        System.out.println("Impossible de construire le kit de démarrage");
    }
    logger.error("INFO - Arret du programme Epicrafter's Journey.");
    }
    
    private static Set<IBloc> constructionSetBlocs() throws IllegalBlocException {
		Set<IBloc> blocs = new LinkedHashSet<IBloc>();

		blocs.add(new Mur(3, 2, 2, true));
		blocs.add(new Mur(3, 2, 2, true));
		blocs.add(new Mur(2, 1, 2, false));
		blocs.add(new Mur(2, 1, 2, false));
		blocs.add(new Porte(1, 2, 2, true));
		blocs.add(new Toit(3,1,1));
		blocs.add(new Toit(3, 1, 1));
		blocs.add(new Toit(3, 1, 1));
		blocs.add(new Toit(3, 1, 1));

		return blocs;
	}

}
