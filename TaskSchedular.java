import java.util.*;
class Task{
    public static void main(String[] args){
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.add("Revise one Java concept");
        ad.add("Practice 2 coding problems");
        ad.add("Update portfolio with one achievement/project");
        ad.add("Do one art/craft activity");
        ad.add("Help with one household task");
          while(!ad.isEmpty())
        {
             System.out.println(ad.removeFirst() +" -- TASK COMPLETED");
        }

    }
}