import java.util.Scanner;
class Jagged{
    public static void main(String[] args){
        // int[][] arr={{1,2,3},{1,2},{1,3,4,5}};   =====> Litral Way
        // // 1 2 3
        // // 1 2
        // // 1 3 4 5
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        Scanner sc=new Scanner(System.in);            //==========> Non-Litral Way
        System.out.println("Enter the Array Elements:");
        int[][] arr=new int[4][];
        arr[0]=new int[4];
        arr[1]=new int[2];
        arr[2]=new int[1];
        arr[3]=new int[4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("\nThe Array Elements are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}