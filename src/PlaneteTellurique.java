//La classe PlaneteTellurique hérite de la Planete et implements l'interface Habitable car seules
// les planetes telluriques sont habitables
public class PlaneteTellurique extends Planete implements Habitable{

    Vaisseau vaisseauDejaAccoste;
    int totalVisiteurs;

    PlaneteTellurique(String nom){
        super(nom);
    }
    @Override
    //Méthode qui permet l'accueil des vaisseaux sur les planètes
    public Vaisseau accueillirVaisseau(Vaisseau vaisseau){
        totalVisiteurs += vaisseau.nbPassagers;
        //On determine si le vaisseau accueilli est un vaisseau de guerre grace à instanceof et
        // si c'est le cas on réalise un transtypage pour pouvoir utiliser la méthode desactiverArmes()
        if (vaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre) vaisseau).desactiverArmes();
        }
        //Condition qui determine si un vaisseau est déjà accosté, car il ne peut y avoir qu'un seul vaisseau en même temps
        if(vaisseauDejaAccoste==null){
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println("Un vaisseau de type " + vaisseauDejaAccoste.type + " doit s'en aller");
        }
        Vaisseau vaisseauPrecedent = vaisseauDejaAccoste;
        vaisseauDejaAccoste = vaisseau;
        return vaisseauPrecedent;
    }
}
