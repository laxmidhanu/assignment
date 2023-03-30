package cl_eg_29032023;

class staticmethood 
{
int rollno;
String name;
float fee;
Static String College="AGPPIT";
static void change() {
	College= " SRM";
}
staticmethood(int rollno, String name, float fee)
{
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
Void display()
{
	System.out.println(rollno+""+name+""+fee+""+collage);
	
}
public class staticmethood {
	public static void main(String[] args) {
		staticmethood .change();
		staticmethood s1.new staticmethood (101,"laxmi",5000);
		staticmethood  s2.new staticmethood (102, "nan",5400);
		s1.display();
		s2.display();
		
	}
}
}
