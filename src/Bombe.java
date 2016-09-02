public class Bombe 
{
	Plateau p;
	private int[] coords;
	private int portee=1;
	private char name='B';
	private int counter = 3;

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

	public void exploser(Case[][] tab){
		for(int i=0; i<tab.length; i++){
			for(int j=0; j<tab.length; j++){
				if(tab[i][j].getBombe().counter==0){
					if(i!=0 || i!=tab.length || j!=0 || j!=tab.length){
						if(tab[i+1][j].getLaCase()=='D'){
							tab[i+1][j].setLaCase('V');
						}
						if(tab[i-1][j].getLaCase()=='D'){
							tab[i-1][j].setLaCase('V');
						}
						if(tab[i][j-1].getLaCase()=='D'){
							tab[i][j-1].setLaCase('V');
						}
						if(tab[i][j+1].getLaCase()=='D'){
							tab[i][j+1].setLaCase('V');
						}
						if(tab[i][j].getLaCase()=='B'){
							tab[i][j].setLaCase('V');
						}
					}
				}
			}
		}
	}

		public void setName(char name) {
			this.name = name;
		}
	}

