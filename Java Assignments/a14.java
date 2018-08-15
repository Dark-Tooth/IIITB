package a1a;
import java.util.*;
/*Write a function Speak that prints the sound of an animal (input from the standard input).
If animal is "human", the program prints "bla bla bla"; if the animal is "dog", the program
prints "bark"; and if the animal is "cat" then the program prints "meow". Use if-else constructs.
(Speak.java)*/


public class a14 {
	
	
	public String speak(String sound,HashMap<String,String>hm)
	{
		//System.out.print(hm.get(sound.toLowerCase()));
		return hm.get(sound.toLowerCase());
	}

	public static void main(String[] args) {
	HashMap<String,String>hm=new HashMap<>();
	hm.put("human", "blahblahblah..");
	hm.put("dog","Woof");
	hm.put("cat", "meow");
	
	a14 a=new a14();
	
	
	
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Animal");
	String sound=in.nextLine();
	//System.out.println(hm.get(sound.toLowerCase()));
	System.out.print(a.speak(sound,hm));
	
	
	
	}

}
