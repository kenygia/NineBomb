import sort.BombDown;
import sort.BombUp;
import sort.FireDown;
import sort.FireUp;
import sort.Item;
import sort.Skull;
import sort.SpeedDown;

public class Case {

	private Personnage perso;
	private Bombe bombe;
	private Item item;
	private char laCase = ' ';
	
	public Case (Personnage perso, Bombe bombe, char typeCase, Item item){
		this.setPerso(perso);
		this.setBombe(bombe);
		/*if(typeCase == '\0'){
			this.setLaCase(laCase);
		}else{
			this.setLaCase(typeCase);
		}*/
		this.setLaCase(typeCase);
		this.setItem(item);
	}
	
	public char Priorite(){ 
		if(this.laCase == 'I'){
			return '\u25A0';
		}else if(this.laCase == 'D'){
			return '\u25A1';
		}else if(!(this.perso == null)){
			if(this.perso.getNom().equals("Player 1")){ 
				return '\u25B4';
			}else if(this.perso.getNom().equals("Player 2")){
				return '\u25B5';
			}
		}else if (!(this.bombe == null)){		
			if(this.bombe.getName() == 'B'){
				return '\u03CC';
			}
		}else if(!(this.item == null)){
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
		}else if(this.getLaCase() == 'V'){
			return ' ';
		}
	    return this.getLaCase();
	}
	
	public boolean Blocage (){
		if(this.laCase == 'D' || this.laCase == 'I'|| !(this.bombe==null)){
			return true;
		}else{ 
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
