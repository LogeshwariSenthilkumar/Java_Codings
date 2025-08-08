class GarbageCls{
    public void  finalize(){
        System.out.println("Garbage Collector Called....");
    }
    void show(){
        GarbageCls ob=new GarbageCls();
    }
    public static void main(String[] args){
        GarbageCls ob=new GarbageCls();
        //1.Nulling th object reference:
        // ob=null;

        //2.Reassigning the Object Reference:
        // GarbageCls obj=new GarbageCls();
        // ob=obj;

        //3.Anonymous Object Class:
        // new GarbageCls();

        //4.Creating Object inside Method:
        // ob.show();
        System.out.println("Hello");
        System.gc();
    }
}