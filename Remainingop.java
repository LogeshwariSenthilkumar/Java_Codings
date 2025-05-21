//Leftshift and Rightshift
class Remainingop{
	public static void main(String[] args)
	{
		int a=10;  
		System.out.println(a<<2); //left shift -40
	}
}
class Rightshift{
	public static void main(String[] args){
		int b=10;
		System.out.println(b>>2); //right shift -2
	}
}

//Assignment Operator
class Assignment{
	public static void main(String[] args)
	{
		int a=10;   
		System.out.println(a+=10); //20
		System.out.println(a-=10);  //10
		System.out.println(a*=2);   //20
		System.out.println(a/=2);   //10
		System.out.println(a%=2);//0
	
	}
}

//Ternary Operator
class Ternary{
	public static void main(String[] args){
		int a=10;
		int b=10;
		System.out.println((a>b)? "A is Greater" : (b>a)? "B is Greater":(a==b)? "Equal":"Not Equal"); //Equal
	}
}