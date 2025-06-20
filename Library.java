class Author{
    String name;
    int book_count=0;
    Author(String name){
        this.name=name;
    }
    void bookCount(){
        book_count++;
    }
    void showAuthorDetails(){
        System.out.println("Author Name:"+name+" "+"Books Written:"+book_count);
    }
}
class Book{
    String title;
    Author ob;
    Book(String title,Author ob){
        this.title=title;
        this.ob=ob;
         ob.bookCount();
       
    }
    void showBookDetails(){
        System.out.println("Book Title:"+title);
        ob.showAuthorDetails();      
      
    }

}
class LibraryManagement{
    public static void main(String[] args){
        Author a=new Author("J.K.Rowling");
        Book b1= new Book("Harry Potter",a);
        Book b2=new Book("The Running Grave",a);
        Author a1=new Author("Lewis Carroll");
        Book b3=new Book("Alice's Adventures in Wonderland",a1);
        b1.showBookDetails();
        b2.showBookDetails();
        b3.showBookDetails();

    }
}