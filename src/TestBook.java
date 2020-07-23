import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        ProgrammingBook proBook1=new ProgrammingBook("pro001","Tôi thấy hoa vàng trên cỏ xanh",99000,"NNA","Vietnam","short story");
        ProgrammingBook proBook2=new ProgrammingBook("pro002","Mắt Biếc",189000,"NNA","Vietnam","short story");
        ProgrammingBook proBook3=new ProgrammingBook("pro003","Bảy bước đến mùa hè",189000,"NNA","Vietnam","short story");
        ProgrammingBook proBook4=new ProgrammingBook("pro004","Bồ câu không đưa thư",189000,"NNA","Vietnam","short story");
        ProgrammingBook proBook5=new ProgrammingBook("pro005","Chuyện cổ tích dành cho người lớn",189000,"NNA","Vietnam","short story");

        FictionBook ficBook1=new FictionBook("fic001","Tôi thấy hoa vàng trên cỏ xanh",99000,"NNA","literature book");
        FictionBook ficBook2=new FictionBook("fic002","Mắt Biếc",189000,"NNA","literature book");
        FictionBook ficBook3=new FictionBook("fic003","Bảy bước đến mùa hè",189000,"NNA","literature book");
        FictionBook ficBook4=new FictionBook("fic004","Bồ câu không đưa thư",189000,"NNA","literature book");
        FictionBook ficBook5=new FictionBook("fic005","Chuyện cổ tích dành cho người lớn",189000,"NNA","literature book");

        System.out.println(ficBook1+"\n"+ficBook2+"\n"+ficBook3+"\n"+ficBook4+"\n"+ficBook5+"\n"
                +proBook1+"\n"+proBook2+"\n"+proBook3+"\n"+proBook4+"\n"+proBook5+"\n");
        System.out.println("Total price of 10 books is: "+(ficBook1.getPrice()+ficBook2.getPrice()+ficBook3.getPrice()+ficBook4.getPrice()+ficBook5.getPrice()
        +proBook1.getPrice()+proBook2.getPrice()+proBook3.getPrice()+proBook4.getPrice()+proBook5.getPrice()));
    }
}
