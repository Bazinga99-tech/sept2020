// write your own function to decide smaller or greater
import java.util.*;
public class genrate
{
	 void checknumber(int a,int b)
	{
		if(a < b)
		{
			System.out.println("A is Smaller from B");	
		}
		else
		{
			System.out.println("A is Greater from B");
		}
	}
	void  genratenumber()
	{
		int counter;
		System.out.println("Numbers from 11 to 20 ");
		for(counter=20;counter>=11;counter--)
		{
		System.out.println(counter); 
		}
	}
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scn.nextInt();  
		System.out.println("Enter second number");
		int b=scn.nextInt(); 
		genrate obj=new genrate();
		obj.checknumber(a,b);
		obj.genratenumber();
	}
}