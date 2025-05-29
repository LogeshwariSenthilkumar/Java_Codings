//MultiLevel:
class GrandFather{
    void grandfatherProperty(){
        System.out.println("GrandFather Property");
    }

}
class Father extends GrandFather{
void fatherProperty(){
    System.out.println("Father Property");
}
}
class Son extends Father{
    void sonProperty(){
        System.out.println("Son Property");
    }

}
class Demo2{
    public static void main(String[] args){
        Son s=new Son();
        System.out.println("\nSon Class:");
        s.grandfatherProperty();
        s.fatherProperty();
        s.sonProperty();

        System.out.println("\nFather Class:");
        s.grandfatherProperty();
        s.fatherProperty();

        System.out.println("\nGrandFather Class:");
        s.grandfatherProperty();
        
    }
}