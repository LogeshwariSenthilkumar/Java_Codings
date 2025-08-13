import java.util.Scanner;
class Shifting3{
    public static void main(String[] args){
         int[] arr={1,2,3,4,5};
        System.out.println("Before Shift : ");
         for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nEnter the Number of Leftshifts u want (1 to 4 ): ");
        Scanner sc=new Scanner(System.in);
        int shift=sc.nextInt();
        for(int j=0;j<shift;j++){
            int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        }
        
         System.out.println("After Shift : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}