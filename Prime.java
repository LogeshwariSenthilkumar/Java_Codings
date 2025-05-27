import java.util.Scanner;
class Prime{
    public void primeCounter(int n1,int n2){
        int i;
        int count=0;
        for(i=n1;i<=n2;i++){
            if(prime(i)){
                count=count+1;
            }
        }
        System.out.println("Result is:"+count);
}
    public static boolean prime(int num){
        int flag=0;
        if(num==1 || num==0){
            return false;
        }
        else{
            for(int j=2;j<num;j++)
            {
                if(num%j==0){
                    flag=1;
                }
            }

        }
        if(flag==0){
            return true;
        }
    return false;
    }
    public static void main(String[] args)
    {
        Prime ob=new Prime();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Starting and Ending Number:");
        int start=sc.nextInt();
        int end=sc.nextInt();
        ob.primeCounter(start,end);


    }
}