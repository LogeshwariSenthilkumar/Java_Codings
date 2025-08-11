import java.util.*;
class Unique{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence : ");
        String s1=sc.nextLine();
        ArrayList<String> words=new ArrayList<>();
        String[] s2=s1.split(" ");
        for(int i=0;i<s2.length;i++){
            int flag=0;
            for(int j=0;j<words.size();j++){
                if(s2[i].equalsIgnoreCase(words.get(j))){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                words.add(s2[i]);
            }
        }
        System.out.println(words);
        }
    }