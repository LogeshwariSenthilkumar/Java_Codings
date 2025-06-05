class Student{
    int id=55;
    String name="Logeshwari Senthilkumar";
    void showDetails(){
        System.out.println("ID:"+id+" "+"Name:"+name);
    }
}
class Collage extends Student{
    String collagename="VSB";
    void display(){
        super.showDetails();
        System.out.println("Collage Name:"+collagename);
    }
    
}
class Demo{
   public static void main(String[] args){
    Collage obj=new Collage();
    obj.display();
   }
}
