package cl_eg_29032023;
import java.util.Scanner;
//Problem Statement 1
public class Circle {
	private float radius;//decleraring instance variable radius
	static float pi=3.5f;
	//default constructor 1
	Circle()
	{
		radius= 1.5f;
				
	}
//cons 2
	Circle(float radius)
	{
		this.radius= radius;
	}
	//cons 3
	Circle(float radius , float pi)
		{
			this.radius=radius;
		}
		//Method1
		static float calculatorcircleArea(float radius)
		{
			return pi*radius*radius;
		
		}
		//Method2 
		static float calculatorcircumference(float radius)
		{
			return 2*pi*radius;
		}
		public static void main(String [] args)
		{
			Circle obj= new Circle();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the radius");
			float radius = sc.nextFloat();
			System.out.println("the area is :"+calculatorcircleArea(radius));
			System.out.println("the circumference  is :"+calculatorcircumference(radius));
		}
	}
	


