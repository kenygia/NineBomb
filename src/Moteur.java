import java.util.ArrayList;

public class Moteur {

	ArrayList<Personnage> liste;
	static Plateau map;
	
	public Moteur(Plateau map){
		this.liste.add(new Personnage("Player 1"));
		this.liste.add(new Personnage("Player 1"));
		this.map = map;
		//Appel de la fonction de prises de touches
	}
	
	
}
