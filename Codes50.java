import java.util.Scanner;
class Substring{
    String comparsion(String s,int k){
        String smallest=s.substring(0,k);
        String largest=s.substring(0,k);
        for(int i=1;i<=s.length()-k;i++){
            String currentSubString=s.substring(i,i+k);
            if(currentSubString.compareTo(smallest)<0){
                smallest=currentSubString;
            }
            else if(currentSubString.compareTo(largest)>0){
                largest=currentSubString;
            }
        }
        return smallest+"\n"+largest;

    }
}
class Main{
    public static void main(String[] args){
        Substring s1=new Substring();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String ss=sc.nextLine();
        System.out.println("Enter the length of Substring : ");
        int kk=sc.nextInt();
        System.out.println(s1.comparsion(ss,kk));
    }
}