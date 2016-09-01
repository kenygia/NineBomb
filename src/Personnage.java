
public class Personnage {
	char[] touche = new char[]{'z','q','s','d',' '};
	String nom ;
	
	public Personnage(){
		nom="Player 1";
	}
	
	public Personnage(String chaine){
		nom=chaine;
	}
	
	public char getToucheBombe(){
		return this.touche[this.touche.length-1];
	}
}
