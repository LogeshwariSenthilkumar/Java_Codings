class Library{
    String name="Abc Library";
    private int library_id=23;
    private int books_count=1000;
    void displayLibraryDetails(){
        System.out.println("Libary Name : "+name);
    }
    class Book{
        String book_name="Harry Potter";
        String author_name="J. K. Rowling";
        void displayDetails(){
            displayLibraryDetails();
            System.out.println("Library_id : "+library_id);
            System.out.println("Book Count in Library : "+books_count);
            System.out.println("Book Name : "+book_name);
            System.out.println("Author Name : "+author_name);
        }
    }
}
class Main{
    public static void main(String[] args){
       Library l1=new Library();
       Library.Book b=l1.new Book();
       b.displayDetails();
    }
}