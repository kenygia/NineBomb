
public class Hello {

	public static void main(String[]args){
		Plateau plateau = new Plateau(4, 3);
		System.out.println(plateau.toString());
		
		Moteur.getTouches();
	}
}
