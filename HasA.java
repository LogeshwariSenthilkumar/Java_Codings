class Library{
    Books ob;
    void collofBooks(Books ob){
        this.ob=ob;
        System.out.println(ob.s+" "+ob.s1);
        System.out.println(ob.s3+" "+ob.s4);
        System.out.println(ob.s5);
    }
}
class Books{
    String s="Book1";
    String s1="Book2";
    String s3="Book3";
    String s4;
    String s5;
    Books(String s4,String s5){
        this.s4=s4;
        this.s5=s5;
    }

}
class Demo{
    public static void main(String[] args){
        Books obj=new Books("Book4","Book5");
        System.out.println(obj.s);
        // Library ob1=new Library();
        // ob1.collofBooks(obj);
    }
}