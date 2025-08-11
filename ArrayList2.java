import java.util.*;
class Collection2{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        //1.Adding:
        //1.1 add(value);
        al.add(10);
        al.add(20);
        al.add(30);
        // System.out.println(al);
        //1.1 add(int index,value);
        al.add(1,11);
        System.out.println(al);
        ArrayList<Integer> al2=new ArrayList<>();
        //1.3 addAll(arrayList);
        // al2.addAll(al);
        // System.out.println(al2);
        al2.add(10);
        al2.add(30);
        // System.out.println(al2);
        //1.4 addAll(index,arrayList);
        // al2.addAll(1,al);
        // System.out.println(al2);
        // al.clear();
        // System.out.println(al);
        // System.out.println(al2.get(0));
        
        //2.delete:
        //2.1 clear();
        // al.clear();
        //2.2 remove(index);
        // al.remove(1);
        //2.3 remove(obj);
        // al.remove(Integer.valueOf(11));
        //2.4 removeAll(arrayList);
        // al.removeAll(al2);
        //2.5 removeRange(start,end);
        //  al.removeRange(1,3);
        //2.6 removeIf(condition);
        // al.removeIf(n->n>10);

        //3.Accessing elements:
        //3.1 get(index);
        // System.out.println(al.get(0));
        //3.2 contains(value);
        // System.out.println(al.contains(101));
        //3.3 indexOf(value);
        // System.out.println(al.indexOf(10));
        //3.4 lastIndexOf(value);
        // al.add(40);
        // al.add(30);
        // System.out.println(al.lastIndexOf(30));
        //3.5 isEmpty();
        // System.out.println(al.isEmpty());
        //3.6 size();
        // System.out.println(al.size());

        //4.Modifiying elements:
        //4.1 set(index,value);
        // al.set(0,9);
        //4.2 replaceAll(function);
        ArrayList<String> al3=new ArrayList<>();
        al3.add("Hi");
        al3.add("Hello");
        // al3.replaceAll(f->f.toUpperCase());
        //4.3 sort(compare);
        // al3.sort(String::compareTo);

        //5.Conversion and Cloning:
        //5.1 Object[] toArray()
        // Object[] arr=al3.toArray();
        // System.out.println(Arrays.toString(arr));
        //5.2 T[]:
        // String[] arr=al3.toArray(new String[0]);
        // System.out.println(Arrays.toString(arr));
        //5.3 clone()
        // ArrayList<String> copy=(ArrayList<String>)al3.clone();
        // System.out.println(copy);

        //6.Capacity:
        //6.1 ensureCapacity(int minvalue);
        // ArrayList<Integer> al4=new ArrayList<>();
        // al4.ensureCapacity(50);
        // for(int i=0;i<50;i++){
        //     al4.add(i);
        // }
        // System.out.println(al4.size());
        //6.1 trimToSize();
        //  ArrayList<Integer> al4=new ArrayList<>();
        // al4.ensureCapacity(50);
        // for(int i=0;i<20;i++){
        //     al4.add(i);
        // }
        // al4.trimToSize();
        // System.out.println(al4.size());
        
        //7.Sublist:
        //7.1 Sublist(s,e);
        al3.add("Welcome");
        al3.add("Login");
        al3.add("Success");
        // List<String> list=al3.subList(2,4);
        // System.out.println(list);
        //7.2 iterator();
        // Iterator<String> it=al3.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        //7.3 forward and backward iterator();
        //          ListIterator<String> li = al3.listIterator();
        
        // System.out.println("Forward direction:");
        // while (li.hasNext()) {
        //     System.out.println(li.next());
        // }
        
        // System.out.println("Backward direction:");
        // while (li.hasPrevious()) {
        //     System.out.println(li.previous());
        // }
        //7.4 Spliterator();
        //  Spliterator<String> split = al3.spliterator();
        // split.forEachRemaining(System.out::println);
        System.out.println(al);
        


    }
}