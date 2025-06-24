import java.util.Scanner;
class Search{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        int flag=0;
        System.out.println("Enter the Element to Search:");
        int element=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("Index:"+i);
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Not found!!!");
        }
        
    }
}