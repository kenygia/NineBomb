import sort.Item;

public class Case {

	private Personnage perso;
	private Bombe bombe;
	private Item item;
	private char laCase;
	
	public Case (Personnage perso, Bombe bombe, char typeCase, Item item){
		this.setPerso(perso);
		this.setBombe(bombe);
		if (typeCase == 'I'){
			this.laCase = 'I';
		}else if (typeCase == 'D'){
			this.laCase = 'D';
		}else { //V
			this.laCase = 'V';
		}
		this.setItem(item);
	}
	
	public char Priorite (){
		for(int i = 0 ; i < 4; i++){
			if(this.perso.nom.equals("Player 1")){
				return '1';
			}else if(this.perso.nom.equals("Player 2")){
				return '2';
			}else if(this.bombe.name == 'B'){
				return 'B';
			}else if(!(this.item.equals(null))){
				return 'I';
			}else{
				return this.getLaCase();
			}
		}
		return 'X'; //X = il y a un problème
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
