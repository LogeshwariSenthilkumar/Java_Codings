@FunctionalInterface
interface Eight3{
    Sample get(String s);
}
class Sample{
    String s;
    Sample(String s){
        this.s=s;
        System.out.println("Constructor "+s);
    }
}
class Demos5{
    public static void main(String[] args) {
        Eight3 e=Sample::new;
        e.get("Logu");
        Eight3 e1=(name)->new Sample(name);
        e1.get("Janu");

    }
}