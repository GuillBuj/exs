package bases;

public class ex0 {

    public static void main(String[] args){

        System.out.println(categorieFilm("Star Wars"));
        System.out.println(categorieFilm("Blanche Neige"));
        System.out.println(categorieFilm("Indiana Jones"));
        System.out.println(categorieFilm("Le Roi Lion"));
        System.out.println(categorieFilm("bla"));


    }

    public static String categorieFilm(final String film){

        var resultat = switch(film){
            case "Star Wars" -> "Science fiction";
            case "Blanche Neige", "Le Roi Lion" -> "Disney";
            case "Indiana Jones" -> {
                String categorie = "Aventure";
                yield categorie;
            }
            default -> "Inconnu";
        };
        return resultat;
    }
    
}
