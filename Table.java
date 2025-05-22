class Looping{
	public static void main(String[] args)
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i+"x2="+i*2);
		}
	}
}


class For{
	public static void main(String[] args)
	{
		int j;
		for(j=1;j<=50;j++)
		{
			if((j%3==0) && (j%5==0))
			{
				System.out.println("FizzBuzz");
			}
			else if(j%3==0){
				System.out.println("Fizz");
			}
			else if(j%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(j);
			}
		}
	}
}