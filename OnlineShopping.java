class Product{
    String name;
    double price;
    int quantity;
    Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    double totalPrice(){
        return price*quantity;
    }
    void showProductDetails(){
        System.out.println("Name:"+name+" x "+quantity+"= Rs."+totalPrice());
    }
}
class ShoppingCart{
    Product p1,p2;
    void addProduct1(Product p){
        p1=p;
    }
    void addProduct2(Product p){
        p2=p;
    }
    void removeProduct(String name){
        if(p1!=null && p1.name.equals(name)){
            p1=null;
        }
        else if(p2!=null && p2.name.equals(name)){
            p2=null;
        }
    }
    void showCart(){
        double total=0;
        if(p1!=null){
            p1.showProductDetails();
            total+=p1.totalPrice();
        }
        if(p2!=null){
            p2.showProductDetails();
            total+=p2.totalPrice();
        }
        System.out.println("Total Price:"+total);
    }


}
class OnlineShopping{
    public static void main(String[] args){

        ShoppingCart cart=new ShoppingCart();
        Product pen=new Product("pen",10,2);
        Product book=new Product("book",120,3);
        cart.addProduct1(pen);
        cart.addProduct2(book);
        cart.showCart();
        System.out.println("After Removing one Product:");
        cart.removeProduct("pen");
        cart.showCart();
    }
}