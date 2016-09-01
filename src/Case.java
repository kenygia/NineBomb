
public class Case {

	private boolean perso;
	private boolean bombe;
	private boolean typeCase; //vide, rocher destructible ou indestructible
	private boolean item;
	
	public Case (boolean perso, boolean bombe, boolean typeCase, boolean item){
		this.setPerso(perso);
		this.setBombe(bombe);
		this.setTypeCase(typeCase);
		this.setItem(item);
	}
	
	public char Priorite (){
		for(int i = 0 ; i < 4; i++){
			if(this.perso){
				return 'P';
			}else if(this.bombe){
				return 'B';
			}else if(this.item){
				return 'I'
			}else if
		}
	}
	
	/*
	 * GETTERS AND SETTERS
	 */

	public boolean isPerso() {
		return perso;
	}

	public void setPerso(boolean perso) {
		this.perso = perso;
	}

	public boolean isBombe() {
		return bombe;
	}

	public void setBombe(boolean bombe) {
		this.bombe = bombe;
	}

	public boolean isTypeCase() {
		return typeCase;
	}

	public void setTypeCase(boolean typeCase) {
		this.typeCase = typeCase;
	}

	public boolean isItem() {
		return item;
	}

	public void setItem(boolean item) {
		this.item = item;
	}
	
}
