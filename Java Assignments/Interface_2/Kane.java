package w2;



public class Kane implements Wrestlers {
	
	String theme;
	String finisher;
	Kane(String theme,String finisher)
	{
		this.theme=theme;
		this.finisher=finisher;
	}
	
	public String getthememusic()
	{
		return this.theme;
	}
	public void payment(int hour)
	{
		System.out.println("payment: "+hour*500+"$");
	}
	
}
