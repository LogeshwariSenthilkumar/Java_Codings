import java.util.Scanner;
class Maximum{
    public static void main(String[] args){
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Numbers:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum Number is:"+max);
        System.out.println("Minimum Number is:"+min);

    }

}