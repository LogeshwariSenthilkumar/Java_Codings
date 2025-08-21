import java.util.*;
class Gate{
    public static void main(String[] args){
        String[] persons={"Ram","Kumar","Ram"};
        boolean gateClosed=true;
        int count=1;
        Arrays.sort(persons);
        for(int i=1;i<persons.length;i++){
          if(persons[i].equals(persons[i-1])){
            count++;
          }
          else{
            if(count%2!=0){
                gateClosed=false;
                break;
            }
            count=1;
          }
        }
        if(count%2!=0){
            gateClosed=false;
        }
        if(gateClosed){
            System.out.println("Gates Closed!!!");
        }
        else{
            System.out.println("Not Closed!!!");
        }
    }
}