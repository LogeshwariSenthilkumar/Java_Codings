import java.util.Scanner;
class Table {
	public void tables(int n) {
		int i;
		System.out.println("Table is:");
		for(i=1;i<=10;i++) {
			System.out.println(i+"x"+n+"="+(i*n));
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Which Table:");
		int num=sc.nextInt();
		Table obj=new Table();
		obj.tables(num);
		
	}


}
