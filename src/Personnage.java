
public class Personnage {
	char[] touche = new char[]{'z','q','s','d',' '};
	int[][] deplacement = new int[][]{{0,-1},{-1,0},{0,1},{1,0},{0,0}};
	String nom ;
	int[] coords;
	
	public Personnage(){
		nom="Player 1";
		this.coords = new int[]{0,0};
	}
	
	public Personnage(String chaine){
		nom=chaine;
		this.coords = new int[]{0,0};
	}
	
	public Personnage(String chaine, int[]coords){
		this.nom=chaine;
		this.coords=coords;
	}
	
	public char getToucheBombe(){
		return this.touche[this.touche.length-1];
	}
	
	public void setCoords(int[]coords){
		this.coords=coords;
	}
	
	public int[]getCoords(){
		return this.coords;
	}
	
	public int[] getDeplacement(char c){
		for(int i=0;i<this.touche.length-2;i++){
			if(this.touche[i]==c){
				return this.deplacement[i];
			}
		}
		return new int[]{0,0};
	}
}
