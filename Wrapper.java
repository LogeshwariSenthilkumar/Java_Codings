class Wrapper{
    public static void main(String[] args){
        int a=10;
        Integer b=Integer.valueOf(a);     //Boxing
        System.out.println(a);
        System.out.println(b.getClass());

        int c=20;
        Integer d=c;
        System.out.println(c);              //Auto-Boxing
        System.out.println(d.getClass());

        Integer f=30;
        int g=f.intValue();              //UnBoxing
        System.out.println(f.getClass());
        System.out.println(g);

        Integer h=40;
        int i=h;
        System.out.println(h.getClass());                     //Auto-unBoxing
        System.out.println(i);
     }
}