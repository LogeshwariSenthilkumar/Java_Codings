import java.util.Scanner;
class OddorEven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int odd_Count=0;
        int even_Count=0;
        System.out.println("Enter the "+size+" Elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even_Count++;
            }
            else{
                odd_Count++;
            }
        }
        System.out.println("ODD Count:"+odd_Count);
        System.out.println("Even Count:"+even_Count);
    }
}