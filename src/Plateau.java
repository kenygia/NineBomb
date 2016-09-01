import sort.Item;

public class Plateau {

	private Case [][] theMap;
	private int longueur;
	private int largeur;
	private int haut;
	private char[][] map;
	private Case vide;
	
	public Plateau (int longueur, int largeur){
		this.theMap = new Case [longueur][largeur];
		this.longueur = longueur;
		this.largeur = largeur;
		
		vide = new Case(null, null, 'V', null);
		//this.theMap
		this.map = new char[][]{{' ',' ','M',' ','P'},
									{' ','D','M','D',' '},
									{'D','M','D','D','M'}};
		
	}
	
	public void deplace(int[] coords, int[] mod)
	{

		int x = coords[0];
		int y = coords[1];
		int nx = coords[0]+mod[0];
		int ny = coords[1]+mod[1];
		
		this.theMap[nx][ny] = this.theMap[x][y];
		this.theMap[x][y] = this.vide;
	}
	
	public boolean checkPerso(Personnage p, int[] mod)
	{
		int x = p.getCoords()[0]+mod[0];
		int y = p.getCoords()[1]+mod[1];
		if ((largeur > y) && (longueur > x) && (x >= 0) && (y >= 0))
			return !(this.theMap[x][y].Blocage());
		return false;
	}
	
	public char retourVal (int x, int y){
		return this.theMap[x][y].Priorite();
	}
	
	public int[][] size(){
		return new int [this.longueur][this.largeur];
	}
	
	public String toString(){
		String chaine = "";
		for(int i=0;i<this.map.length;i++){
			for(int j=0;j<this.map[0].length;j++){
				chaine += this.map[i][j]/*.Priorite()*/;
			}
			chaine += "\n";
		}
		return chaine;
	}
}
