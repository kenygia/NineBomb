
public class Moteur {

	Personnage perso;
	Map map;
	
	public Moteur(Personnage perso, Map map){
		this.perso = perso;
		this.map = map;
		
		//Appel de la fonction de prises de touches
	}
	
	public void action(char c){
		if(c==this.perso.getToucheBombe()){
			
		}else{
			int[]pos = perso.getCoords();
			map[pos[0]][pos[1]] = '.'; //Espace vide
			
		}
	}
}
