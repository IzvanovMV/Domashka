import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Владимир", "Петров", "Васильевич", 10001 , "ЮР", new GregorianCalendar(1990, Calendar.FEBRUARY, 25), "9999991");
        Reader reader2 = new Reader("Андрей", "Иванов", "Сергеевич", 10002 , "ПИ", new GregorianCalendar(2000, Calendar.DECEMBER, 12), "9999992");
        Reader reader3 = new Reader("Аннна", "Сидорова", "Алексеевна", 10003 , "МЕН", new GregorianCalendar(2003, Calendar.MAY, 3), "9999993");
        Reader reader4 = new Reader("Евгений", "Смирнов", "Николаевич", 10004 , "ЖУР", new GregorianCalendar(1998, Calendar.JUNE, 7), "9999994");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Приключения", "Кинг");
        Book book2 = new Book("Словарь", "Даль");
        Book book3 = new Book("Энциклопедия", "Браун");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(5);
        reader2.takeBook("Приключения", "Словарь");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook(1);
        reader2.returnBook("Словарь", "Энциклопедия");
        reader3.returnBook(book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}
