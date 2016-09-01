
public class Plateau {

	private char [][] theMap;
	private int longueur;
	private int largeur;
	
	public Plateau (int longueur, int largeur){
		this.theMap = new char [longueur][largeur];
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public char retourVal (int x, int y){
		return this.theMap[x][y];
	}
	
	public int[][] size(char [][] tab){
		return new int [this.longueur][this.largeur];
	}
	
}
