import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Moteur {

	ArrayList<Personnage> liste = new ArrayList<>();
	static char[]touches;
	int nbMorts;
	
	public Moteur(){
		this.liste.add(new Personnage("Player 1"));
		this.liste.add(new Personnage("Player 1"));
		//this.plateau = new Plateau(5, 5);
	}
	
	public Moteur(Personnage p1, Personnage p2){
		touches = this.getTouches();
		this.liste.add(p1);
		this.liste.add(p2);
		//this.plateau = new Plateau(p1, p2);
		nbMorts=0;
		//Appel de la fonction de prises de touches
		
		Plateau plateau = new Plateau(p1, p2);
		
		
		int cpt=0;
		while(!finDePartie()){
			//debut du jeu
			int actions = this.liste.get(cpt).getNbAction();
			while(actions>0){
				//tour dun joueur
				//this.priseDeTouches();
				plateau.affichage();
				Menu menu = new Menu(this.liste.get(cpt),plateau);
				menu.deplaceAffich();
				actions--;
			}
			
			//fin de la boucle
			this.nbMorts=0;
			cpt++;
			while(cpt<this.liste.size() && this.liste.get(cpt).estMort()==true){
				cpt++;
				nbMorts++;
			}
			if(cpt==this.liste.size()){
				cpt=0;
				Bombe.exploser(plateau.getMap());
				//Explosions des bombes
			}
		}
	}
	
	public boolean finDePartie(){
		return this.nbMorts>=this.liste.size()-1;
	}
	
	public char[] getTouches(){
		BufferedReader text;
		try {
			text = new BufferedReader(new FileReader("./ressources/touches"));
		} catch (FileNotFoundException e) {
			text = null;
		}
		char[] touches = new char[5];
		for(int i=0;i<touches.length;i++){
			try {
				touches[i] = text.readLine().charAt(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return touches;
	}
	
	public void priseDeTouches(){
		Scanner sc = new Scanner(System.in);
		char c = 0;
		while(c==0){
			try{
				c=sc.nextLine().charAt(0);
			}catch(StringIndexOutOfBoundsException e){
				
			}
		}
		System.out.println(c);
	}
	
	public static void main(String[]args){
		Personnage p1 = new Personnage("Player1",new int[]{1,1});
		Personnage p2 = new Personnage("Player2",new int[]{8,8});
		new Moteur(p1,p2);
	}
}
