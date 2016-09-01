
public class Personnage {
	
	private boolean mort;
	private String nom ;
	private int[] coords;
	private int nbAction = 2;
	private boolean botAuto = false;
	
	public Personnage(){
		this.setMort(false);
		setNom("Player 1");
		this.coords = new int[]{0,0};
	}
	
	public Personnage(String chaine){
		this.setMort(false);
		setNom(chaine);
		this.coords = new int[]{0,0};
	}
	
	public Personnage(String chaine, int[]coords){
		this.setMort(false);
		this.setNom(chaine);
		this.coords=coords;
	}
	
	public void setCoords(int[]coords){
		this.coords=coords;
	}
	
	public int[]getCoords(){
		return this.coords;
	}

	public boolean estMort() {
		return mort;
	}

	public void setMort(boolean mort){
		this.mort = mort;
	}
	
	public void faireMourir() {
		this.mort = true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbAction() {
		return nbAction;
	}

	public void setNbAction(int nbAction) {
		this.nbAction = nbAction;
	}

	public boolean estBotAuto() {
		return botAuto;
	}

	public void setBotAuto(boolean botAuto) {
		this.botAuto = botAuto;
	}
}
