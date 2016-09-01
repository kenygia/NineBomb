import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Moteur {

	ArrayList<Personnage> liste;
	static Plateau plateau;
	int nbMorts;
	
	public Moteur(){
		this.liste.add(new Personnage("Player 1"));
		this.liste.add(new Personnage("Player 1"));
		this.plateau = new Plateau(5, 5);
	}
	
	public Moteur(Plateau map){
		this.liste.add(new Personnage("Player 1"));
		this.liste.add(new Personnage("Player 1"));
		this.plateau = map;
		nbMorts=0;
		//Appel de la fonction de prises de touches
		
		int cpt=0;
		while(!finDePartie()){
			//debut du jeu
			int actions = this.liste.get(cpt).getNbAction();
			while(actions>0){
				
			}
			
			//fin de la boucle
			this.nbMorts=0;
			cpt++;
			while(cpt<this.liste.size() && this.liste.get(cpt).estMort()==true){
				cpt++;
				nbMorts++;
			}
			if(cpt==this.liste.size()){
				cpt=0;
			}
		}
	}
	
	public boolean finDePartie(){
		return this.nbMorts<this.liste.size()-1;
	}
	
	public static char[] getTouches(){
		BufferedReader text;
		try {
			text = new BufferedReader(new FileReader("./ressources/touches"));
		} catch (FileNotFoundException e) {
			text = null;
		}
		char[] touches = new char[5];
		for(int i=0;i<touches.length;i++){
			try {
				touches[i] = text.readLine().charAt(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return touches;
	}
}
