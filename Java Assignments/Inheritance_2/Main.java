package p1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> Rect=new ArrayList<Rectangle>();
		Rect.add(new Rectangle(5,4));
		Rect.add(new Square(5));
		Rect.add(new Point());
		for(int i=0;i<Rect.size();i++)
		{
			System.out.println(Rect.get(i).area());
		}
		

	}

}
