class Book{
    void read(){
        System.out.println("Reading...");
    }
}
class TextBook extends Book{
    void highlighting(){
         System.out.println("Highlighting...");
    }
}
class MathTextBook extends TextBook{
    void solveProblems(){
         System.out.println("Solving Problems...");
    }
}
class Demo{
    public static void main(String[] args){
        MathTextBook ob=new MathTextBook();
         System.out.println("MathTextBook Class:");
        ob.read();
        ob.highlighting();
        ob.solveProblems();
    }
}
