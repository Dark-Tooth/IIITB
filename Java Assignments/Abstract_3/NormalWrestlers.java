package w1;

public class NormalWrestlers extends Wrestler{
	String theme,fi,name,gf;
	NormalWrestlers(String th,String fi,String name,String gf)
	{
		super(th,fi);
		this.name=name;
		this.gf=gf;
	}
	public String toString()
	{
		return this.name+" "+ super.toString() +" ";
	}
	String outfitgear(String gear)
	{
		return this.name+" "+this.gf+" ";
	}
	
}
