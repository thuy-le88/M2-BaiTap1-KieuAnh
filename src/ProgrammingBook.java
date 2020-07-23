public class ProgrammingBook extends Book {
    private String language;
    private String frameWork;

    public ProgrammingBook() {

    }

    public ProgrammingBook(String language, String frameWork) {
        this.language = language;
        this.frameWork = frameWork;
    }

    public ProgrammingBook(String bookCode, String name, int price, String author, String language, String frameWork) {
        super(bookCode, name, price, author);
        this.language = language;
        this.frameWork = frameWork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }

    @Override
    public String toString() {
        return super.toString()+"; language: "+this.getLanguage()+"; frameWork: "+this.getFrameWork();
    }

    public static void main(String[] args) {
        ProgrammingBook book3=new ProgrammingBook("2010001","Tôi thấy hoa vàng trên cỏ xanh",99000,"NNA","Vietnam","short story");
        ProgrammingBook book4=new ProgrammingBook("2010002","Mắt Biếc",189000,"NNA","Vietnam","short story");

        System.out.println(book3);
        System.out.println(book4);
    }
}
