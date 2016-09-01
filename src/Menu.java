
public class Menu
{

	Personnage p;
	Plateau m;
	
	public Menu(Personnage perso, Plateau map)
	{
		this.p = perso;
		this.m = map;
	}

	// deplacement 
	
	public void deplaceNORD()
	{
		int [] mod = new int[] {0, -1};
		if (this.m.checkPerso(this.p, mod))
		{
			m.deplace(p.coords, mod);
			p.setCoords(mod);
		}
	}
	
	public void deplaceEST()
	{
		int [] mod = new int[] {1, 0};
		if (this.m.checkPerso(this.p, mod))
		{
			m.deplace(p.coords, mod);
			p.setCoords(mod);
		}
		
	}
	
	public void deplaceSUD()
	{
		int [] mod = new int[] {0, 1};
		if (this.m.checkPerso(this.p, mod))
		{
			m.deplace(p.coords, mod);
			p.setCoords(mod);
		}
		
	}
	
	public void deplaceOUEST()
	{
		int [] mod = new int[] {-1, 0};
		if (this.m.checkPerso(this.p, mod))
		{
			m.deplace(p.coords, mod);
			p.setCoords(mod);
		}
		
	}
	
	public void poserBomb()
	{
		
	}
	
	
}
