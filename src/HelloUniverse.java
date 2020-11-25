public class HelloUniverse {

    public static void main(String... args) {

        // Création de différentes instances de planetes
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;
        PlaneteTellurique terre= new PlaneteTellurique("Terre");
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        System.out.println("-----------------------------------------------------------------------------");

        //Création de vaisseau avant la création des classe VaisseauDeGuerre et VaisseauCivil
        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.nbPassagers = 9;
        nouveauVaisseau.type = "fregate";

        Vaisseau autreVaisseau = new Vaisseau();
        autreVaisseau.nbPassagers = 42;
        autreVaisseau.type = "croiseur";

        mars.accueillirVaisseau(nouveauVaisseau);
        mars.accueillirVaisseau(autreVaisseau);

        System.out.println("Le nombre total est de :" +mars.totalVisiteurs);

        System.out.println("-----------------------------------------------------------------------------");

        Atmosphere atmosphereUranus = new Atmosphere();

        atmosphereUranus.txHelium = 15f;
        atmosphereUranus.txMethane = 2.5f;
        atmosphereUranus.txHydrogene = 83f;

        uranus.atmosphere = atmosphereUranus;

        System.out.println("L'atmosphere de " + uranus.nom + " est composée :");
        System.out.println("De " + uranus.atmosphere.txHelium + "% d'helium");
        System.out.println("De " + uranus.atmosphere.txMethane + "% de méthane");
        System.out.println("De " + uranus.atmosphere.txHydrogene + "% d'hydrogène");

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("La forme d'une planete est " + Planete.forme);
        System.out.println("La forme de "+ mars.nom + " est " + mars.forme);
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.5));
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println(Planete.nbPlanetesDecouvertes);

        System.out.println("-----------------------------------------------------------------------------");

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();

        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;
        chasseur.type = "chasseur";

        VaisseauCivil vaisseauMonde = new VaisseauCivil();

        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;
        vaisseauMonde.type = "vaisseau-monde";

        vaisseauMonde.activerBouclier();

        chasseur.attaque(vaisseauMonde,"lasers photoniques", 3);

        vaisseauMonde.desactiverBouclier();
        System.out.println("Valeur résiduelle du bouclier : "+vaisseauMonde.resistanceDuBouclier);
        System.out.println("Valeur du blindage : "+vaisseauMonde.blindage);


        System.out.println("-----------------------------------------------------------------------------");
        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);

    }

}