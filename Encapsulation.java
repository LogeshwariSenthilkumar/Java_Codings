class Encapsulation{
    private String name;
    private int id;
    Encapsulation(String name,int id){
        this.name=name;
        this.id=id;
    }
    String getName(){
        return name;

    }
    int getId(){
        return id;

    }
    void setName(String name,int id){
        this.name=name;
        this.id=id;
    }

}
class Demo{
    public static void main(String[] args){
        Encapsulation ep=new Encapsulation("Logu",54);
        System.out.println("Name:"+ep.getName());
        System.out.println("ID:"+ep.getId());
        ep.setName("Janani",305);
        System.out.println("Name:"+ep.getName());
        System.out.println("ID:"+ep.getId());
    }
}