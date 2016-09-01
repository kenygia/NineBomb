import sort.*;

public class Case {

	private Personnage perso;
	private Bombe bombe;
	private Item item;
	private char laCase = 'V';
	
	public Case (Personnage perso, Bombe bombe, char typeCase, Item item){
		this.setPerso(perso);
		this.setBombe(bombe);
		this.setLaCase(laCase);
		this.setItem(item);
	}
	
	public char Priorite (){ 
		if(this.perso.getNom().equals("Player 1")){ //Attention à null
			return '1';
		}else if(this.perso.getNom().equals("Player 2")){
			return '2';
		}else if(this.bombe.getName() == 'B'){
			return 'B';
		}else if(!(this.item.equals(null))){
			if (this.item instanceof BombDown){
				return 'e';
			}else if(this.item instanceof BombUp){
				return 'E';
			}else if(this.item instanceof FireDown){
				return 'f';
			}else if(this.item instanceof FireUp){
				return 'F';
			}else if(this.item instanceof Skull){
				return 'D';
			}else if(this.item instanceof SpeedDown){
				return 's';
			}else{
				return 'S';
			}
		}else{
			return this.getLaCase();
		}
	}
	
	public boolean Blocage (){
		if(this.laCase == 'D' || this.laCase == 'I'|| !(this.bombe.equals(null))){
			return true;
		}else{ //Attention à null
			return false;
		}
	}
	
	public Personnage getPerso() {
		return perso;
	}

	public void setPerso(Personnage perso) {
		this.perso = perso;
	}

	public Bombe getBombe() {
		return bombe;
	}

	public void setBombe(Bombe bombe) {
		this.bombe = bombe;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public char getLaCase() {
		return laCase;
	}

	public void setLaCase(char laCase) {
		this.laCase = laCase;
	}
	
}
