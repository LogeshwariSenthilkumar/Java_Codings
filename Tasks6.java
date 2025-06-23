class Author{
    String authorName;
    int id;
    Author(String authorName,int id){
        this.authorName=authorName;
        this.id=id;
    }
    void displayAuthorDetails(){
        System.out.println("Author Name:"+authorName+"\n"+"Author id:"+id);
    }

}
class Book{
    String title;
    Author obj;
    Book(String title,Author obj){
        this.title=title;
        this.obj=obj;
    }
    void bookDetails(){
        System.out.println("Book Title:"+title);
        obj.displayAuthorDetails();
    }

}
class Demo6{
    public static void main(String[] args){
        Author a1=new Author("J.K.Rowling",101);
        Book b1=new Book("Harry Potter",a1);
        b1.bookDetails();
    }
}