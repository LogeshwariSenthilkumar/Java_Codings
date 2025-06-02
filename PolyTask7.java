class InfoDisplay{
    void display(String name){
        System.out.println("Name:"+name);
    }
    void display(String name,int age){
        System.out.println("Name:"+name+" "+"Age:"+age);
    }
    void display(String name,int age,String address){
        System.out.println("Name:"+name+" "+"Age:"+age+" "+"Address:"+address);
    }
}
class Demo{
    public static void main(String[] args)
    {
        InfoDisplay i=new InfoDisplay();
        i.display("Logeshwari Senthilkumar");
        i.display("Logeshwari Senthilkumar",22);
        i.display("Logeshwari Senthilkumar",22,"Paramathi Velur");
       

    }
}