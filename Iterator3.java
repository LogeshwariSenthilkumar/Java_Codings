import java.util.*;
class Demo{
    public static void main(String[] args){
        ArrayList<String> products=new ArrayList<>();
        products.add("Shampoo");
        products.add("FaceWash");
        products.add("Salt");
        products.add("HairOil");
        products.add("Sugar");
        products.add("soap");
        products.add("HairColour");
        System.out.println("Products Name Start with S : ");
        Iterator<String> i=products.iterator();
        while(i.hasNext()){
            String s=i.next();
            if(s.startsWith("S") || s.startsWith("s")){
                System.out.println(s);
            }
        }

    }
}