import java.util.Scanner;
class Vowels{
    public void vowelsCounter(String sentence)
    {
        int i;
        int count=0;
        for(i=1;i<sentence.length();i++)
        {
            if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' ||sentence.charAt(i)=='i' ||sentence.charAt(i)=='o' ||sentence.charAt(i)=='u' ||sentence.charAt(i)=='A' ||sentence.charAt(i)=='E' ||sentence.charAt(i)=='I' ||sentence.charAt(i)=='O' ||sentence.charAt(i)=='U'){
                count=count+1;
            }
        }
        System.out.println("No. of Vowels in a Sentence is:"+count);

    }
    public static void main(String[] args)
    {
        Vowels ob=new Vowels();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String sen=sc.nextLine();
        ob.vowelsCounter(sen);

    }
}