package w1;

public class SuperStars extends Wrestler {
	
	String theme;
	String finisher;
	SuperStars(String theme,String finisher)
	{
		super(theme,finisher);
	}
	void payment(int hour)
	{
		System.out.println("payment: "+hour*500+"$");
	}
}
