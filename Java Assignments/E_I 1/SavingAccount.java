package p1;

public class SavingAccount extends Account {
	float interest;
	SavingAccount(String name,int id)
	{
		super(name,id);
	}
	public void addinterest(float intr)
	{
		float val=(super.getbal()*intr/100);
		super.deposit(val);
		
	}
	public float withdraw(float amount)
	{
		if(amount>=100)
		{
			System.out.println("Max withdrawl amt exceeded!");
			
		}
		else
		{
		 super.withdraw(amount);
			
		}
		return super.getbal();
	}
	

}
