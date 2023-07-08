public class Fichier extends SystemeDeFichier {

	//pas la peine de definir des attributs on a besoin que lister les fichiers?
	
	/*Constructeur*/
	public Fichier(String name){
		this.name = name;
	}

	//methode afficher simple
	public void afficher(){
		System.out.println(name);
	}

}