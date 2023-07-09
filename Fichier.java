public class Fichier extends SystemeDeFichier {
    public Fichier(String name) {
        this.name = name;
    }

    public void afficher(String prefix) {
        System.out.println(prefix + "├── " + name); //pour l'instant pour l'affichage on aura<prefix>├── fichier.txt selon sa place
    }
}