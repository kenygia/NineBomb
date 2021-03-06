import java.util.ArrayList;

public class Plateau {

	private Case[][] theMap;
	private int longueur;
	private int largeur;
	private String map;
	private Case murI;
	private Personnage one ;

	public Plateau(int longueur, int largeur) {
		this.theMap = new Case[longueur][largeur];
		this.longueur = longueur;
		this.largeur = largeur;
		
		murI = new Case(null, null, 'I', null);
		

	}

	public Plateau(Personnage one, Personnage two) {
		this.theMap = new Case[10][10];
		this.longueur = 10;
		this.largeur = 10;
		this.one = one;
		
		murI = new Case(null, null, 'I', null);
		Case o = new Case(one, null, '1', null);
		Case t = new Case(two, null, '2', null);

		this.theMap = new Case[][] { { murI, murI, murI, murI, murI, murI, murI, murI, murI, murI },
				{ murI, o, new Case(null, null, 'V', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'V', null), murI },
				{ murI, new Case(null, null, 'V', null), murI, new Case(null, null, 'V', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), murI },
				{ murI, new Case(null, null, 'V', null), new Case(null, null, 'V', null), murI, new Case(null, null, 'V', null), murI, murI, new Case(null, null, 'V', null), new Case(null, null, 'V', null), murI },
				{ murI, new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), murI, new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), murI },
				{ murI, new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), murI, new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), murI },
				{ murI, new Case(null, null, 'V', null), new Case(null, null, 'V', null), murI, murI, new Case(null, null, 'V', null), murI, new Case(null, null, 'V', null), new Case(null, null, 'V', null), murI },
				{ murI, new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'V', null), murI, new Case(null, null, 'V', null), murI },
				{ murI, new Case(null, null, 'V', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'D', null), new Case(null, null, 'V', null), t, murI },
				{ murI, murI, murI, murI, murI, murI, murI, murI, murI, murI } };
	}

	public int[] deplace(int[] coords, int[] mod) {

		int x = coords[0];
		int y = coords[1];
		int nx = coords[0] + mod[0];
		int ny = coords[1] + mod[1];

		this.theMap[nx][ny].setPerso(this.theMap[x][y].getPerso());
		if(this.theMap[x][y].getPerso().getNom()==this.one.getNom()){
			this.theMap[nx][ny].setLaCase('1');
		}else{
			this.theMap[nx][ny].setLaCase('2');
		}
		this.theMap[x][y].setPerso(null);
		if(this.theMap[x][y].getBombe()!=null){
			this.theMap[x][y].setLaCase('B');
		}else{
			this.theMap[x][y].setLaCase('V');
		}

		return new int[] { nx, ny };
	}

	public boolean checkPerso(Personnage p, int[] mod) {
		int x = p.getCoords()[0] + mod[0];
		int y = p.getCoords()[1] + mod[1];
		return !(this.theMap[x][y].Blocage());
	}

	public char getChar(int x, int y) {
		return this.theMap[x][y].Priorite();
	}

	public Case getCase(int x, int y) {
		return this.theMap[x][y];
	}

	public int[][] size() {
		return new int[this.longueur][this.largeur];
	}

	public void affichage() {
		for(int i=0;i<60;i++){
			System.out.println("");
		}
		this.map = "";
		for (int i = 0; i < this.theMap.length; i++) {
			for (int j = 0; j < this.theMap[0].length; j++) {
				map += this.theMap[i][j].Priorite();
			}
			map += "\n";
		}
		System.out.print(map);
	}
	
	public Case[][] getMap(){
		return this.theMap;
	}
}
