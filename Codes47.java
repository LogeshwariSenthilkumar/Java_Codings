import java.util.Scanner;
class Methods{
    void add(int a,int b){
        System.out.println("Addition Result is : "+(a+b));
    }
    void sub(int a,int b){
        System.out.println("Subraction Result is : "+(a-b));
    }
    static void multiply(int a,int b){
        System.out.println("Multiplication Result is : "+(a*b));
    }
    static void divisible(int a,int b){
        System.out.println("Division Result is : "+(a/b));
    }
     void modulus(int a,int b){
        System.out.println("Modulus Result is : "+(a%b));
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Methods m=new Methods();
        System.out.println("Enter whether Addition,Subraction,Mulitplication,Division,Modulus");
        String choice=sc.nextLine();
        System.out.println("Enter the Two Numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(choice.equalsIgnoreCase("Add")){
            m.add(a,b);
        }
       else if(choice.equalsIgnoreCase("Sub")){
            m.sub(a,b);
        }
        else if(choice.equalsIgnoreCase("Mul")){
            Methods.multiply(a,b);
        }
        else if(choice.equalsIgnoreCase("Div")){
           Methods.divisible(a,b);
        }
        else if(choice.equalsIgnoreCase("Mod")){
            m.modulus(a,b);
        }
    }
}