public class Book {
    private String title;
    private Author author;
    private int price;
    private int qty;

    public Book(String title, Author author, int price, int qty){
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "'"+title+"' "+"by "+author.toString();
    }

}
