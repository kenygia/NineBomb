
public class Personnage {
	
	boolean mort;
	String nom ;
	int[] coords;
	int nbAction = 2;
	
	public Personnage(){
		this.mort=false;
		nom="Player 1";
		this.coords = new int[]{0,0};
	}
	
	public Personnage(String chaine){
		this.mort=false;
		nom=chaine;
		this.coords = new int[]{0,0};
	}
	
	public Personnage(String chaine, int[]coords){
		this.mort=false;
		this.nom=chaine;
		this.coords=coords;
	}
	
	public void setCoords(int[]coords){
		this.coords=coords;
	}
	
	public int[]getCoords(){
		return this.coords;
	}
}
