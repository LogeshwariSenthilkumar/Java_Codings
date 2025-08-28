//as a Stack:
import java.util.*;
class Demo3
{
    public static void main(String[] args){
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.push(30);
        ad.push(15);
        ad.push(40);
        ad.push(20);
        ad.push(10);
        ad.push(65);
        ad.push(10);
        System.out.println(ad);
    }
}