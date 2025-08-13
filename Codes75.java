import java.util.Scanner;
class Shifting4{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("Before Shift : ");
         for(int i:arr){
            System.out.print(i+" ");
        }
         System.out.println("\nEnter the Number of Rightshifts u want (1 to 4 ): ");
        Scanner sc=new Scanner(System.in);
        int shift=sc.nextInt();
        for(int j=0;j<shift;j++){
            int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        }
        
         System.out.println("After Shift : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}