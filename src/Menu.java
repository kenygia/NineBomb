import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu
{

	private Personnage p;
	private Plateau m;
	public static Scanner scan = new Scanner(System.in);
	private Random rand;
	
	public Menu(Personnage perso, Plateau map)
	{
		this.p = perso;
		this.m = map;
	}

	// deplacement 
	
	public void deplaceNORD()
	{
		int [] mod = new int[] {0, -1};
		if (this.checkDeplaceNORD())
		{
			m.deplace(p.getCoords(), mod);
			p.setCoords(mod);
		}
	}
	
	public void deplaceEST()
	{
		int [] mod = new int[] {1, 0};
		if (this.checkDeplaceEST())
		{
			m.deplace(p.getCoords(), mod);
			p.setCoords(mod);
		}
		
	}
	
	public void deplaceSUD()
	{
		int [] mod = new int[] {0, 1};
		if (this.checkDeplaceSUD())
		{
			m.deplace(p.getCoords(), mod);
			p.setCoords(mod);
		}
		
	}
	
	public void deplaceOUEST()
	{
		int [] mod = new int[] {-1, 0};
		if (this.checkDeplaceOUEST())
		{
			m.deplace(p.getCoords(), mod);
			p.setCoords(mod);
		}
		
	}
	
	// checkdeplace
	
	public boolean checkDeplaceNORD()
	{
		int [] mod = new int[] {0, -1};
		return this.m.checkPerso(this.p, mod);
	}
	
	public boolean checkDeplaceEST()
	{
		int [] mod = new int[] {1, 0};
		return this.m.checkPerso(this.p, mod);
	}
	
	public boolean checkDeplaceSUD()
	{
		int [] mod = new int[] {0, 1};
		return this.m.checkPerso(this.p, mod);
	}
	
	public boolean checkDeplaceOUEST()
	{
		int [] mod = new int[] {-1, 0};
		return this.m.checkPerso(this.p, mod);
	}
	
	
	// poserbomb
	
	public void poserBomb()
	{
		Bombe b = new Bombe(p.getCoords());
		m.getCase(p.getCoords()[0], p.getCoords()[1]).setBombe(b);
	}
	
	//affich
	
	public void deplaceAffich() 
	{
		boolean[] tab = new boolean[9]; 

		tab[0] = false;
		tab[1] = this.checkDeplaceNORD();
		tab[2] = this.checkDeplaceEST();
		tab[3] = this.checkDeplaceSUD();
		tab[4] = this.checkDeplaceOUEST();
		tab[5] = true;
		
		int t = 0;
		while (this.checkLoop(tab, t)) {
			System.out.println("/////////");
			System.out.println("Selecttionner l'action :");
			if (tab[1])
				System.out.println("1 - deplacement au NORD    ");
			if (tab[2])
				System.out.println("2 - deplacement à l'EST ");
			if (tab[3])
				System.out.println("3 - deplacement au SUD     ");
			if (tab[4])
				System.out.println("4 - deplacement à l'OUEST ");
			if (tab[5])
				System.out.println("5 - poser une bombe    ");
			System.out.println("/////////");
			
			if (p.estBotAuto())
				t = this.motusAuto(tab);
			else
				t = scan.nextInt();
		}

		switch (t) {
		case 1:
			this.deplaceNORD();
			break;
		case 2:
			this.deplaceEST();
			break;
		case 3:
			this.deplaceSUD();
			break;
		case 4:
			this.deplaceOUEST();
			break;
		case 5:
			this.poserBomb();
			break;
		default:
			System.out.println("Abattement impossible");
		}

	}

	//affich utils
	
	private boolean checkLoop(boolean[] tab, int t) 
	{
		if (t > tab.length)
			return true;
		if (tab[t] == false) {
			if (t != 0)
				System.out.println("Choix Invalide");
			return true;
		}
		return false;
	}
	
	private int motusAuto(boolean[] tab)
	{
		ArrayList<Integer> t = new ArrayList<Integer>();
		for(int i = 0; i != tab.length; i++)
		{
			if (tab[i])
				t.add(i);
		}
		int r = rand.nextInt(t.size());
		System.out.println(r);
		return t.get(r);
	}
}
