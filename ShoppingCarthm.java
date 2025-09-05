import java.util.*;
class Shopping{
    public static void main(String[] args){
        HashMap<String,Integer> products=new HashMap<>();
        products.put("Pen",50);
        products.put("Note",70);
        products.put("Chart",5);
        products.put("Paper",30);
        products.put("Pencil",10);
        int total=0;
        for(Map.Entry<String,Integer> map:products.entrySet()){
             total+=map.getValue();
        }
        System.out.println("Total Price : "+total);

    }
}