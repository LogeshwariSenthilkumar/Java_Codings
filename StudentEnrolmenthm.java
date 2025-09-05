import java.util.*;
class Student{
    public static void main(String[] args){
        HashMap<Integer,String> student=new HashMap<>();
        student.put(101,"Logu");
        student.put(102,"Chitra");
        student.put(103,"Dhivya");
        student.put(104,"Senthil");
        student.put(105,"Madhu");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roll No : ");
        int roll=sc.nextInt();
        if(student.containsKey(roll)){
            System.out.println("Name is : "+student.get(roll));
        }
        else{
            System.out.println("RollNo Not Found!!!");
        }

        
    }
}