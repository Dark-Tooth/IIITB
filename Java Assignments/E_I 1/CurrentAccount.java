package p1;

public class CurrentAccount extends Account {

	float overdraftlimit;
	CurrentAccount(String n,int id)
	{
		super(n,id);
	
	}
	
	public float withdraw(float odl)
	{
		if(super.getbal()-odl>=0)
		{
			super.withdraw(odl);
		}
		
		return super.getbal();
	}
	
}
