import java.util.ArrayList;
import java.util.List;

public class Dossier extends SystemeDeFichier {
    private List<SystemeDeFichier> enfants;

    public Dossier(String name) {
        this.name = name;
        this.enfants = new ArrayList<>();
    }

    public void afficher(String prefix) {
        System.out.println(prefix + "└── " + name + "/");
        for (int i = 0; i < enfants.size() - 1; i++) {
            enfants.get(i).afficher(prefix + "│   ");
        }
        if (!enfants.isEmpty()) {
            enfants.get(enfants.size() - 1).afficher(prefix + "    ");
        }
    }
     public void ajouterEnfant(SystemeDeFichier enfant) {
        enfants.add(enfant);
    }
}