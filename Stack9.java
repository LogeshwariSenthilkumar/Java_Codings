import java.util.*;
class Stack9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence : ");
        String s=sc.nextLine();
        String[] split=s.split(" ");
        Stack<String> words=new Stack<>();
        for(int i=0;i<split.length;i++){
            words.push(split[i]);
        }
        System.out.println("Reversed Sentence : ");
        for(int i=words.size();i>=1;i--){
             System.out.print(words.peek()+" ");
            words.pop();
           
        }
    }
}