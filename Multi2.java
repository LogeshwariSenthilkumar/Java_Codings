class File1 extends Thread{
public void run(){
    for(int i=10;i<=100;i+=10)
    System.out.println("File1 Downloading  -- "+i+" %");
}
}
class File2 extends Thread{
public void run(){
    for(int i=10;i<=100;i+=10)
    System.out.println("File2 Downloading  -- "+i+" %");
}
}
class File3 extends Thread{
public void run(){
    for(int i=10;i<=100;i+=10)
    System.out.println("File3 Downloading  -- "+i+" %");
}
}
class Downloading{
    public static void main(String[] args){
        File1 f1=new File1();
        f1.start();
         File2 f2=new File2();
        f2.start();
         File3 f3=new File3();
        f3.start();
    }
}