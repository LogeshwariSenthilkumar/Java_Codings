class Book{
    void book1(){
        System.out.println("Java");
    }
    void book2(){
        System.out.println("Python");
    }
    void book3(){
        System.out.println("Donet");
    }
}
class School{
    Book ob;
    School(Book ob){
        this.ob=ob;
    }
    void display(){
        ob.book1();
        ob.book2();
        ob.book3();
    }
}
class Demo{
    public static void main(String[] args){
        Book b=new Book();
        // b.book1();
        School s=new School(b);
        s.display();
    }
}