package w1;

abstract public class Wrestler {
	
	String theme,finisher;
	Wrestler(String theme, String finisher)
	{
		this.theme=theme;
		this.finisher=finisher;
	}
	void payment(int hour)
	{
		System.out.println("payment: "+hour*300+"$");
	}
	public String toString()
	{
		return this.theme+" "+this.finisher + " ";
	}
}
