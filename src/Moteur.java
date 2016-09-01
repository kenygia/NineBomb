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
			int[]deplace = perso.getDeplacement(c);
			int[] newPos = new int[]{pos[0]+deplace[0],pos[1]+deplace[1]};
			if(newPos[0]>=map.size() || newPos[0]<0 || newPos[1]>=map.size() || newPos[1]<0){
				//Aucune action
			}else{
				map[pos[0]][pos[1]] = '.'; //Espace vide
				map[newPos[0]][newPos[1]]='p'; 
			}
			
		}
	}
}
