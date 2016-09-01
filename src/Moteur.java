import java.util.ArrayList;

public class Moteur {

	ArrayList<Personnage> liste;
	static Plateau map;
	int nbMorts;
	
	public Moteur(Plateau map){
		this.liste.add(new Personnage("Player 1"));
		this.liste.add(new Personnage("Player 1"));
		this.map = map;
		nbMorts=0;
		//Appel de la fonction de prises de touches
		
		int cpt=0;
		while(nbMorts<this.liste.size()-1){
			//debut du jeu
			int actions = this.liste.get(cpt).nbAction;
			while(actions>0){
				
			}
			
			//fin de la boucle
			nbMorts=0;
			cpt++;
			while(cpt<this.liste.size() && this.liste.get(cpt).mort==true){
				cpt++;
				nbMorts++;
			}
			if(cpt==this.liste.size()){
				cpt=0;
			}
		}
	}
	
	
}
