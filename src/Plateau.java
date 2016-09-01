
public class Plateau {

	private char [][] theMap;
	private int longueur;
	private int largeur;
	private int haut;
	
	public Plateau (int longueur, int largeur){
		this.theMap = new char [longueur][largeur];
		this.longueur = longueur;
		this.largeur = largeur;
		
		this.theMap = new char[][]{{' ',' ','M',' ','P'},
									{' ','D','M','D',' '},
									{'D','M','D','D','M'}};
		
	}
	
	public char retourVal (int x, int y){
		return this.theMap[x][y];
	}
	
	public int[][] size(char [][] tab){
		return new int [this.longueur][this.largeur];
	}
	
	public String toString(){
		String chaine = "";
		for(int i=0;i<this.theMap.length;i++){
			for(int j=0;j<this.theMap[0].length;j++){
				chaine += this.theMap[i][j];
			}
			chaine += "\n";
		}
		return chaine;
	}
}
