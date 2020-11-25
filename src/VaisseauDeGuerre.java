public class VaisseauDeGuerre extends Vaisseau{

    boolean armesDesactivees;


    //Methode qui permet aux vaisseaux de guerre d'attaquer d'autres vaisseaux
    void attaque (Vaisseau vaisseauCible, String arme, int dureAttaque){
        //Condition qui determine si les armes sont desactivées (condition pour pouvoir atterrir sur une planete)
        if(armesDesactivees){
            System.out.println("Attaque impossible");
        } else {
            System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseauCible.type + " en utilisant l'arme " +
                    arme + " pendant " + dureAttaque + " minutes");
            //Le vaisseau attaqué perd son bouclier et son blindage est divisé par 2
            vaisseauCible.resistanceDuBouclier = 0;
            vaisseauCible.blindage = vaisseauCible.blindage/2;
        }
    }

    //Méthode qui permet de désactiver les armes des vaisseaux de guerre
    void desactiverArmes(){
    armesDesactivees=true;
    System.out.println("Desactivation des armes d'un vaisseau de type :" + type);
    }

}
