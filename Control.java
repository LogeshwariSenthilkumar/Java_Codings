//selection:
//1.If:
class If{
	public static void main(String[] args)
	{
		int mark=35;
		if(mark>=35){
			System.out.println("Pass");
		}
	}
}

//2.If_Else:
class IfElse{
	public static void main(String[] args)
	{
		int mark=33;
		if(mark>=35){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
	}
}}

//3.If_Elseif:
class IfElseif{
	public static void main(String[] args)
	{
		int mark=25;
		if(mark>=90 && mark<=100){
			System.out.println("A");
		}
		else if(mark>=80 && mark<90){
			System.out.println("B");
		}
		else if(mark>=70 && mark<80){
			System.out.println("C");
		}
		else if(mark>=60 && mark<=70){
			System.out.println("D");
		}
		else if(mark>=35){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
	}
}
	
}

//4.Nestedif:
class Nestedif{
	public static void main(String[] args)
	{
		int mark=85;
		int per=75;
		if(mark>=85){
			System.out.println("First Selected");
			if(per>=85)
			{
				System.out.println("Second Selected");
				System.out.println("Selected for Interview");
			}
			else{
				System.out.println("Second not selected");
			}
		}
		else{
			System.out.println("First not selected");
		}
	}
}

//5.Switch:
class Switch{
	public static void main(String[] args)
	{
		int value=2;
		switch(value)
		{
			case 1:
				System.out.println("1");
				break;
			
			case 2:
				System.out.println("2");
				break;
			
			case 3:
				System.out.println("3");
				break;
			
			default:
				System.out.println("Wrong");
			
		}
	}
}