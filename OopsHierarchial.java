//Hierarchial:
class Father{
void fatherProperty(){
    System.out.println("Father Property");
}
}
class Brother extends Father{
    void brotherProperty(){
        System.out.println("Brother Property");
    }

}
class Sister extends Father{
    void sisterProperty(){
        System.out.println("Sister Property");
    }

}
class Demo3{
    public static void main(String[] args){
        Brother b= new Brother();
        System.out.println("\nBrother Class:");
        b.fatherProperty();
        b.brotherProperty();
        System.out.println("\nSister Class:");
        Sister s=new Sister();
        s.fatherProperty();
        s.sisterProperty();
         
    }
}