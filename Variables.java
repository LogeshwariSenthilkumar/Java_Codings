class Student
{
	String name; //Instance Variable
	int id;      //Instance Variable
	static String schoolname="ABC School"; //Static Variable
public static void main(String[] args)
{
	Student ob1=new Student();
	Student ob2=new Student();
	ob1.name="Logu";
	ob1.id=101;
	ob2.name="DD";
	ob2.id=102;
	
	String bloodgroup1="B+ve"; //Local Variable
	String bloodgroup2="O+ve"; //Local Variable 
	
	System.out.println(ob1.name+" "+ob1.id+" "+ob1.schoolname+" "+bloodgroup1);
	System.out.println(ob2.name+" "+ob2.id+" "+ob2.schoolname+" "+bloodgroup2);
	
}
}