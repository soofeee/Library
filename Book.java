package Library;


public class Book {
    
    private String book;
    private double price;
  
    public Book(String book,double price){
        this.book=book;
        this.price=price;
    }

    public String getBook() {
        return book;
    }


    public double getPrice() {
        return price;
    }


    public void setBook(String book) {
        this.book = book;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    
    /*public void bookList (){
        System.out.println(book+" "+id+" "+price+" "+author);
 
    }*/
    
    public String toString(){
        return"Book name: "+book+", Price: "+price;
    }
}
