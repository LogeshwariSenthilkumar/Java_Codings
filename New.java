import java.util.Scanner;
class New{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50}; //Litral Creation of Array
        int[] arr1=new int[6];      //Non-Litral Creation of Array
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nEnter Array 6 Values:");
        for(int j=0;j<arr1.length;j++){
            arr1[j]=sc.nextInt();
        }
        System.out.println("\nThe Array values are:");
        for(int k:arr1){
            System.out.print(k+" ");
        }
    }
}