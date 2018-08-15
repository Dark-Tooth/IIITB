package p1;

 public class Account {
    String name;
    int acno;
	private float bal;
	Account(String n,int acno)
	{
		this.name=n;
		this.acno=acno;
		this.bal=0;
	}
	
	public float getbal()
	{
		return this.bal;
	}
	
	public float deposit(float amount)
	{
		return this.bal+=amount;
		
	}
	public float withdraw(float amount)
	{
		if(this.bal-amount<=0)
		{
			System.out.println("Insufficeient Funds");
		}
		
		 this.bal-=amount;
		 return this.bal;
	}
	public String toString()
	{
		return this.name +" "+ this.acno +" "+ this.getbal() ;
	}
}
