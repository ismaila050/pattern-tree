import java.io.File;
public class Test {
    public static void main(String[] args) {
        //String chemin_repertoire = "I:/PROGRAMMES/Dossier";
        String chemin_repertoire = args[0];
        File vrai_repertoire = new File(chemin_repertoire);

        if (vrai_repertoire.exists() && vrai_repertoire.isDirectory()) {
            SystemeDeFichier root = convertirEnSystemeDeFichier(vrai_repertoire);
            root.afficher("");
        } else {
            System.out.println("Le répertoire spécifié est introuvable.");
        }
    }

    public static SystemeDeFichier convertirEnSystemeDeFichier(File file) {
        if (file.isFile()) {
            return new Fichier(file.getName());
        } else if (file.isDirectory()) {
            Dossier dossier = new Dossier(file.getName());
            File[] fichiersDuDossier = file.listFiles();
            if (fichiersDuDossier != null) {
                for (File enfant : fichiersDuDossier) {
                    SystemeDeFichier elementEnfant = convertirEnSystemeDeFichier(enfant);
                    dossier.ajouterEnfant(elementEnfant);
                }
            }
            return dossier;
        } else {
            return null;
        }
    }
}
