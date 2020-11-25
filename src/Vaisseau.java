public class Vaisseau {
    String type;
    int nbPassagers;
    int blindage;
    int resistanceDuBouclier;

    //Méthode qui permet d'activer le bouclier d'un vaisseau
    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+ type);
    }

    //Méthode qui permet de désactiver le bouclier d'un vaisseau
    void desactiverBouclier(){
        System.out.println("Desactivation du bouclier d'un vaisseau de type "+ type);
    }
}
