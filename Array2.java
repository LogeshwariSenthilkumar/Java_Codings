import java.util.Scanner;
class Sum{
    public static void main(String[] args){
        int[] marks=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 Subject Marks:");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        int avg=sum/5;
        System.out.println("Total Marks:"+sum);
        System.out.println("Average:"+avg);
    }
}