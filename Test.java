import java.io.File; //importation de la classe File


public class Test{
public static void main(String[] args) {
String chemin_repertoire = "I:/PROGRAMMES/JAVA/"; //un ex pour tester
//on convertit d'abord la variable en un repertoire ou fichier grace au opérations de file(utile poour manupuler les fichier)

File vrai_repertoire = new File(chemin_repertoire);
//on verifier si le repertoire existe et s'il est un vrai repertoire 
if (vrai_repertoire.exists() && vrai_repertoire.isDirectory()) {
//on affiche tous les fichiers existants
SystemeDeFichier root = convertirEnFichier(vrai_repertoire);
            root.afficher(); 	
 } 
 else{
 	System.out.println("Le repertoire spécifié est introuvable ");
 }
}

//cette methode parcours le repertoire specifié à la recherche de tous les fichiers et  retourne un dossier contenant tous les fichiers listés
//il verifie si c'est un fichier il le stocke et l'ajoute
//si c'est un dossier , il stocke tous les elements enfants du dossier dans un tableau , et refais le traitement : i.e s'il rencontre un dossier 
//il creer un autre tableau ......
//a la fin on aura lister tous les fichiers 
public static SystemeDeFichier convertirEnFichier(File file){
	if(file.isFile()){
		return new Fichier(file.getName()); 
	}
	else if (file.isDirectory()) { //si c'est un dossier , instacier 
		Dossier ce_Dossier = new Dossier(file.getName(),file.getAbsolutePath());//on recupere le nom du dossier et son chemin
		File[] fichiersDuDossier = file.listFiles(); //on recupére la liste de tous les fichiers du dossier 
		if(fichiersDuDossier !=null){
			for(File enfant : fichiersDuDossier){
				SystemeDeFichier elementEnfant = convertirEnFichier(enfant);
				ce_Dossier.add(elementEnfant);
			}
		}
		return ce_Dossier;  
	}
	else{
		return null;
	}
}
	
}
