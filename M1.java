import java.util.Scanner;
class MultiArray{
    public static void main(String[] args){
        // int[][] arr={{1,2,3},{1,2,3}};   =========> Litral way
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        Scanner sc=new Scanner(System.in);                 //===========> Non-Litral Way
        System.out.println("Enter the Array Elements:");
        int[][] arr=new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("\nThe Array Elements are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}