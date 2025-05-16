class Example
{
String name;
int id;
public static void main(String[] args)
{
	Example ob1=new Example();
	ob1.name="Logu";
	ob1.id=101;
	
	Example ob2=new Example();
	ob2.name="Janu";
	ob2.id=102;
	
	Example ob3=new Example();
	ob3.name="DD";
	ob3.id=103;
	
	Example ob4=new Example();
	ob4.name="Barani";
	ob4.id=104;
	
	System.out.println(ob1.name+" "+ob1.id);
	
	System.out.println(ob2.name+" "+ob2.id);
	
	System.out.println(ob3.name+" "+ob3.id);
	
	System.out.println(ob4.name+" "+ob4.id);
}
}