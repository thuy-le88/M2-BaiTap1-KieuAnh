import java.util.ArrayList;

public class FictionBook extends Book {
    private String category;
    public FictionBook() {

    }
    public FictionBook(String category) {
        this.category=category;
    }

    public FictionBook(String bookCode, String name, int price, String author, String category){
        super(bookCode,name,price,author);
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString()+"; category: "+this.getCategory();
    }

    /*public static void main(String[] args) {
        FictionBook book1=new FictionBook("2010001","Tôi thấy hoa vàng trên cỏ xanh",99000,"NNA","literature book");
        FictionBook book2=new FictionBook("2010002","Mắt Biếc",189000,"NNA","literature book");
        FictionBook book3=new FictionBook("2010003","Bảy bước đến mùa hè",189000,"NNA","literature book");
        FictionBook book4=new FictionBook("2010004","Bồ câu không đưa thư",189000,"NNA","literature book");
        FictionBook book5=new FictionBook("2010005","Chuyện cổ tích dành cho người lớn",189000,"NNA","literature book");

        System.out.println(book1+"\n"+book2+"\n"+book3+"\n"+book4+"\n"+book5+"\n");

    }*/
}
