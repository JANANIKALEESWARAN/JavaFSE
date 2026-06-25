import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearch {

  
    public static Book linearSearch(Book[] books, String title) {

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }

    
    public static Book binarySearch(Book[] books, String title) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result =
                books[mid].title.compareToIgnoreCase(title);

            if (result == 0)
                return books[mid];

            if (result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Book[] books = {
            new Book(101, "C Programming", "Dennis Ritchie"),
            new Book(102, "Data Structures", "Mark Allen"),
            new Book(103, "Java Programming", "James Gosling"),
            new Book(104, "Python Basics", "Guido van Rossum")
        };

        System.out.println("Linear Search:");

        Book b1 =
            linearSearch(books, "Java Programming");

        if (b1 != null)
            System.out.println(b1);
        else
            System.out.println("Book Not Found");


        Arrays.sort(books,
            Comparator.comparing(book -> book.title));

        System.out.println("\nBinary Search:");

        Book b2 =
            binarySearch(books, "Python Basics");

        if (b2 != null)
            System.out.println(b2);
        else
            System.out.println("Book Not Found");
    }
}