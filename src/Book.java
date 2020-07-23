public class Book {
    private String bookCode;
    private String name;
    private int price;
    private String author;

    public Book() {

    }

    public Book(String bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book name: "+this.getName()+"; author: "+this.getAuthor()+"; code: "+this.getBookCode()+"; price: "+this.getPrice();
    }

    /*public static void main(String[] args) {
        Book book1=new Book("2010001","Tôi thấy hoa vàng trên cỏ xanh",99000,"NNA");
        Book book2=new Book("2010002","Mắt Biếc",189000,"NNA");
        System.out.println(book1);
        System.out.println(book2);
    }*/
}
