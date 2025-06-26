import java.util.Scanner;
class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Array Elements are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("["+i+"]"+"["+j+"]"+"="+arr[i][j]);
            }
        }
    }
}