class Run{
    int add(int a,int b){
        System.out.println(a+b);
        return 0;
    }
}
class Runtime extends Run{
    int add(int a,int b){
        System.out.println(a-b);
        return 0;
    }

}
class Demo2{
    public static void main(String[] args){
        Runtime ob=new Runtime();
        ob.add(30,10);

    }
}