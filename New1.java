import java.util.Scanner;
class New1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String[] names={"Logeshwari","Janani","DhivyaDharshini","Barani"};
        for(String n:names){
           System.out.print(n+" ");
        }
        System.out.println("\nEnter 4 Names:");
        String[] names1=new String[4];
        for(int i=0;i<names1.length;i++){
            names1[i]=sc.nextLine();
        }
        System.out.println("\nThe names are:");
        for(String e:names1){
            System.out.print(e+" ");
        }
    }
}