import java.util.*;
class CheckParenthese{
    public static void main(String[] args){
        ArrayDeque<Character> ad=new ArrayDeque<>();
        String exp="{[a+b]*(c+d)";
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                ad.push(ch);
            }
            else if(ch==')' || ch==']' || ch=='}'){
                if(ad.isEmpty()){
                    System.out.println("UNBALANCED");
                    return;
                }
                char top=ad.pop();
                if((ch==')' && top!='(') || (ch==']' && top!='[') || (ch=='}' && top!='{')){
                  System.out.println("UNBALANCED");
                  return;
                }
            }
        }
        if(ad.isEmpty()){
            System.out.println("BALANCED");
        }
        else{
            System.out.println("UNBALANCED");
        }

    }
}