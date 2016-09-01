public class Bombe 
{
	
	private int[] coords;
	private int portee=1;
	private char name='B';
	
	public Bombe(int[]c)
	{
		this.setCoords(c);
	}
	
	public void setCoords(int[]coords){
		this.coords=coords;
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
}

