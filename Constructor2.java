class Staff{
    String name;
    int id;
    Staff(String name1,int id1){
        name=name1;
        id=id1;
    }
    void display(){
        System.out.println(name+" "+id);

    }

}
class Constructor2{
    public static void main(String[] args){
        Staff ob1= new Staff("Logu",101);
        Staff ob2=new Staff("Janu",102);
        ob1.display();
        ob2.display();
    }
}