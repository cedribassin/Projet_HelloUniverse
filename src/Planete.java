import org.w3c.dom.ls.LSOutput;

public class Planete {
    String nom ;
    int diametre;
    int unTourComplet = 360;
    Atmosphere atmosphere;
    static String forme = "spherique";
    static int nbPlanetesDecouvertes=0;


    Planete (String nom){
        this.nom = nom;
        nbPlanetesDecouvertes++;
    }

    //Fonction qui permet d'indiquer le nombre de tour d'une planete autour de son étoile
    int revolution(int tourDegré){
        int nbTotal = tourDegré/unTourComplet;
        return nbTotal;
    }

    //Fonction qui permet d'indiquer le nombre de tour qu'effectue une planete sur elle-même
    int rotation(int tourDegré){
        int nbTotal = tourDegré/unTourComplet;
        return nbTotal;
    }


    //Fonction statique (car commune à toutes les planètes)
    static String expansion (double distance){
        if (distance<14){
            return "Oh la la mais c'est super rapide!";
        } else{
            return "Je rêve ou c'est plus rapide que la vitesse de la lumière";
        }
    }

}
