class Function2{
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add=(n1, n2)->n1+n2;
        System.out.println(add.apply(10,20));
        BiFunction<String,String,String> con=(n1,n2)->n1+n2;
        System.out.println(con.apply("Logeshwari"," Senthilkumar"));

    }
}