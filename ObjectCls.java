class ObjectCls implements Cloneable{
    int a;
    public String toString(){
        return "ObjectCls";
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        ObjectCls ob=new ObjectCls();
       ob.a=10;
        ObjectCls obj=(ObjectCls)ob.clone();
        obj.a=20;
        System.out.println(ob.a);
        System.out.println(obj.a);   //----- clone() 
        System.out.println("Class Name : "+ob.getClass());  //-- getClass()
        System.out.println("Hash Code : "+ob.hashCode());   //-- hashCode()
        System.out.println(ob.toString());                  //-- toString()

    }
}