import java.util.List;

public class showData {
    public static void main(String[] args) {
        AddDataToArrayList b = new AddDataToArrayList();
        List<Book> mybooklist = b.bookdetails();
        for (Book book : mybooklist) {
            System.out.println(STR."\{book.getNumber()} \{book.getName()} \{book.getCategory()} \{book.getAuthor()}");
        }
    }
}
