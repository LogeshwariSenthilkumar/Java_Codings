interface Bank{
   int no=20;
    void number();
}
class Demo implements Bank{

   public void number(){
        System.out.println(no);
    }
}
class Demo1{
    public static void main(String[] args){
        Demo ob=new Demo();
        ob.number();
    }
}
