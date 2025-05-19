class Operators{
	public static void main(String[] args)
	{
		//Unary Operators
		int a=10;
		int b=20;
		System.out.println(++a); //11
		System.out.println(a++); //11
		System.out.println(a);   //12
		
		System.out.println(--b); //19
		System.out.println(b--); //19
		System.out.println(b);
		
	}
}
class A{
	public static void main(String[] args){
		//Arithmatic Operators
		int a=10;
		int b=30;
		System.out.println(a+b); //40
		System.out.println(a-b); //-20
		System.out.println(a*b); //300
		System.out.println(a/b); //0
		System.out.println(a%b); //10
	}
}
class B{
	public static void main(String[] args){
		//Relational Operators
		int a=10;
		int b=10;
		System.out.println(a==b); //t
		System.out.println(a>b); //f
		System.out.println(a>=b); //t
		System.out.println(a<b); //f
		System.out.println(a<=b); //t
		System.out.println(a!=b); //f
	}
}
class C{
	public static void main(String[] args)
	{
		//Logical Operators
		int a=30;
		int b=20;
		System.out.println((a==b)&&(a>b)); //f
		System.out.println((a==b)||(a>b)); //t
		System.out.println(!(a==b)&&(a>b)); //t
	}
}
class D{
	public static void main(String[] args)
	{
		//Bitwise Operators
		int a=5;
		int b=4;
		System.out.println(a&b);//4
		System.out.println(a|b);//5
		System.out.println(a^b); //1
	}
}