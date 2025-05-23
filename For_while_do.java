class Task3 {
		//For Loop:
		public static void main(String[] args) {
			int i;
			System.out.println("For Loop:");
			for(i=1;i<=50;i++) {
				if((i%3==0) &&(i%5==0))
				{
					System.out.print("FizzBuzz"+" ");
				}
				else if(i%3==0) {
					System.out.print("Fizz"+" ");
				}
				else if(i%5==0)
				{
					System.out.print("Buzz"+" ");
				}
				else {
					System.out.print(i+" ");
				}
			}
			System.out.println(" ");
			//While Loop:
			
			int j=1;
			System.out.println("While Loop:");
			while(j<=50)
			{
				if((j%3==0) &&(j%5==0))
					{
						System.out.print("FizzBuzz"+" ");
					}
					else if(j%3==0) {
						System.out.print("Fizz"+" ");
					}
					else if(j%5==0)
					{
						System.out.print("Buzz"+" ");
					}
					else {
						System.out.print(j+" ");
					}
					j++;
				
			}
			System.out.println(" ");
			//Dowhile:
			int k=1;
			System.out.println("DoWhile Loop:");
			do {
				if((k%3==0) &&(k%5==0))
				{
					System.out.print("FizzBuzz"+" ");
				}
				else if(k%3==0) {
					System.out.print("Fizz"+" ");
				}
				else if(k%5==0)
				{
					System.out.print("Buzz"+" ");
				}
				else {
					System.out.print(k+" ");
				}
				k++;
			}while(k<=50);
			
		}	
	}


