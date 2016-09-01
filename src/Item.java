
public abstract class Item {
	String nom;
	
	Item(){
		
	}
	
	Item(String chaine){
		this.nom=chaine;
	}
	
	abstract String Action();
}
