package cl_eg_29032023;

class Staticvar
{
	int rollno;
	String name;
	float fee;
	static String collage= "agpit";
	//constructor
	Staticvar(int rollno, String name, float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	//method
	void dispaly()
	{
		System.out.println(rollno+" "+name+" "+fee+" "+collage);
		
	}
}
public class Staticvar1
{
	public static void main(String[] args)
	{
		Staticvar s1=new Staticvar(101,"laxmi", 5000);
		Staticvar s2=new Staticvar(102,"Nandini",2000);
		s1.display();
		s2.display();
	}
}