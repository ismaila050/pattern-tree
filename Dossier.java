import java.util.List;
import java.util.ArrayList;


public class Dossier extends SystemeDeFichier{
	private List<SystemeDeFichier> enfant ;  
	private String chemin; //on en aura besoin pour lister les fichiers du repertoire grace à la classe File


//constructeur
public Dossier(String name,String chemin){
	this.name=name;
	this.enfant=new ArrayList<>();
	this.chemin = chemin;
}

public void afficher(){

	System.out.println("Dossier "+name );
	for (SystemeDeFichier element : enfant ) {
		element.afficher();
		
	}
}

	//methode qui ajoute un element dans un Dossier

	public void add(SystemeDeFichier element) {
        enfant.add(element);

    }
}
