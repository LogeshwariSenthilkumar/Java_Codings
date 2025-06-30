import java.util.Scanner;
class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=1;
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            System.out.println(n+" "+s);
            n++;
            
        }

    }
}