import java.util.ArrayList;
import java.util.List;

public class Directory extends SystemeDeFichier {
    private List<SystemeDeFichier> enfants;

    public Dossier(String name) {
        this.name = name;
        this.enfants = new ArrayList<>();
    }

    //affichage d'un dossier le plus compliqué!!!!

    public void afficher(String prefix) {
        System.out.println(prefix + "└── " + name + "/"); //pour l'affichage du dossier actuel ce sera par ex <prefix>└── JAVA/ le prefix peut etrr un espace ?
        for (int i = 0; i < enfants.size() - 1; i++) {
            enfants.get(i).afficher(prefix + "│   ");
        }
        if (!enfants.isEmpty()) {
            enfants.get(enfants.size() - 1).afficher(prefix + "    ");
        }
    }


    //D'abord il afficher le repertoire actuelle sous le format<prefix>└── JAVA/ 
    //puis parcours tous les elements enfants du dossier et invoque leurs methodes afficher en "augmentant" l'indentation
    //on verifie si le dossier n'est pas vide , si tel n'est pas le cas 
     public void ajouterEnfant(SystemeDeFichier enfant) {
        enfants.add(enfant);
    }
}