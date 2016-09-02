public class Bombe 
{
	Plateau p;
	private int[] coords;
	private int portee=1;
	private char name='B';
	private int counter = 2;

	public Bombe(int[]c)
	{
		this.setCoords(c);
	}

	public void setCoords(int[]coords){
		this.coords=coords;
	}

	public void setPortee(int portee) {
		this.portee = portee;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int[] getCoords(){
		return this.coords;
	}

	public char getName()
	{
		return this.name;
	}


	public int getPortee()
	{
		return this.portee;
	}

	public int getCounter()
	{
		return this.counter;
	}

	public void decounter()
	{
		if (this.counter >= 1 )
			this.counter = this.counter - 1;

	}

	public static void exploser(Case[][] tab){
		for(int i=0; i<tab.length; i++){
			for(int j=0; j<tab.length; j++){			
				if(tab[i][j].getBombe() != null) {
					Bombe bombe = tab[i][j].getBombe();
					bombe.decounter();
					int coord0 = bombe.getCoords()[0];
					int coord1 = bombe.getCoords()[1];
					if(bombe.counter==0){
						if(i!=0 || i!=tab.length || j!=0 || j!=tab.length){
							if(tab[coord0+1][coord1].getLaCase()=='D'){
								tab[coord0+1][coord1].setLaCase('V');
							}
							if(tab[coord0-1][coord1].getLaCase()=='D'){
								tab[coord0-1][coord1].setLaCase('V');
							}
							if(tab[coord0][coord1-1].getLaCase()=='D'){
								tab[coord0][coord1-1].setLaCase('V');
							}
							if(tab[coord0][coord1+1].getLaCase()=='D'){
								tab[coord0][coord1+1].setLaCase('V');
							}
							tab[coord0][coord1].setLaCase('V');
							persoExplode(coord0, coord1-1, tab);
							persoExplode(coord0, coord1+1, tab);
							persoExplode(coord0-1, coord1, tab);
							persoExplode(coord0+1, coord1, tab);
							persoExplode(coord0, coord1, tab);
							tab[i][j].setBombe(null);
						}
					}
				}
			}
		}
	}
	
	private static void persoExplode(int x, int y,Case[][] tab)
	{
		if(tab[x][y].getPerso() != null)
		{
			tab[x][y].getPerso().faireMourir();
			tab[x][y].setPerso(null);
		}
	}

		public void setName(char name) {
			this.name = name;
		}
	}

