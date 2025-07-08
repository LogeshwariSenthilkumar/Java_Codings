import java.util.*;
class Expcls8{
    public static void main(String[] args){
        try{
            try{
                try{
                    try{
                        String s2="Hello";
                        System.out.println(s2.charAt(10));
                    }
                    catch(StringIndexOutOfBoundsException e){
                        System.out.println(e);
                    }
                    String s1=null;
                    System.out.println(s1.toLowerCase());
                }
                catch(NullPointerException e){
                    System.out.println(e);
                }
                int[] a={1,2,3};
                System.out.println(a[10]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            int c=10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}