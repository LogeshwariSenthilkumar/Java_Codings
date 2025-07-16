class Computer{
    private int num=10;
    String name="Dell";
    class Professor{
        String prof_name="Logu";
        void displayDetails(){
            num=20;
            System.out.println("Computer Name : "+name);
            System.out.println("Professor Name : "+prof_name);
            System.out.println("Computer No after Changing : "+num);
        }
    }
}
class Demo{
    public static void main(String[] args){
        Computer c=new Computer();
        Computer.Professor p=c.new Professor();
        p.displayDetails();
    }
}