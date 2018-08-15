package w1;

public class Wwe {

	public static void main(String[] args) {
		
	Wrestler Kane=new SuperStars("HellFire","TombStone");//Special Wrestler
	Wrestler Edge=new SuperStars("On this Day","Spear");
	Wrestler w1=new NormalWrestlers("Vehicle Grudge","DDT","Dean Ambrose","Renee");
	Kane.payment(5);
	Edge.payment(5);
	w1.payment(5);
	System.out.println(w1.toString());
	
	

	}

}
