import java.util.Scanner;
class Array{
    public static void main(String[] args){
        // int[] arr={1,2,3,4,5,6};  =======> Litral way
        // for(int val:arr){
        //     System.out.print(val+" ");
        // }
        
        Scanner sc=new Scanner(System.in);  //==========> Non-Litral way
        int[] arr=new int[4];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array Elements are:");
        for(int val:arr){
            System.out.print(val+" ");
        }

    }
}