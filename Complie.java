class Complie{
    void cycle(){
        System.out.println("Two wheeler and Three Wheeler Cycles are Ready!!!");
    }
    void cycle(int a,int b){
        System.out.println(a+b+" Wheeler Cycles are Ready!!!");
    }
    void cycle(int a,int b,int c){
        System.out.println(a+b+c+" Wheeler Cycles are Ready!!!");
    }

}
class Demo{
    public static void main(String[] args)
    {
        Complie ob=new Complie();
        ob.cycle();
        ob.cycle(1,1);
        ob.cycle(1,1,1);

    }
}