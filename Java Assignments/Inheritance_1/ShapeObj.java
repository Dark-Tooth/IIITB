package p1;

class Shape
{
	 static float pi=3.142857f;
	 public String color;
	 
	 Shape(String color)
	 {
		 this.color=color;
	 }
	 
	 public String toString()
	 {
		 return ("Color: "+this.color );
	 }

	 
}


class Circle extends Shape
{
	//Common value shared by all objects
	private float rad;// Encapsulation
	Circle(float radius,String color)
	{
		super(color);//inheritance usage avoid repeating same code
		this.rad=radius;
		
		
	}
	public float getradius()
	{
		return this.rad;
	}
	public void setradius(float radius) //Encapsulation
	{
		this.rad=radius;
	}
	public String toString()
    {
        return (super.toString()+" Radius = "+this.rad + " Area = " + this.area());
    }
	public float area()
	{
		return (this.rad)*(this.rad)*pi;
	}
}

 class Square extends Shape
 {
 	
 	private float side;
 	Square(float side,String color)
 	{
 		super(color);
 		this.side=side;
 		
 	}
 	public Square get()
 	{
 		return this;
 	}
 	public void setsidelength(float len)
 	{
 		this.side=len;
 	}
 	public String toString()
    {
        return (super.toString()+" Side length = "+this.side +" Area = " + this.area());
    }
 	public float area()
 	{
 		return (this.side)*(this.side);
 	}
 }
public class ShapeObj {

	public static void main(String[] args) {
	
		Circle c1=new Circle(7,"Red"); //make shapeobj class abstract and define the methods for 
		Square c2=new Square(5,"Blue"); //using parent ref for child
		//You can't access the data members in here like rad or color
		//to access those use public methods
		c1.setradius(14);
		c2.setsidelength(12);
		System.out.println(c1.toString()+" "+c1.area());
		System.out.println(c2.toString()+" "+c2.area());
		
	}

}
