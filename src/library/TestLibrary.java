package library;

import library.contents.Book;
import library.contents.Copy;
import library.individuals.User;
import library.contents.*;

import java.util.Date;

// All test* methods were tested
public class TestLibrary {

    public static  int test0(Book book0, Copy copy0, User user0)  throws Throwable  {
        Library library0 = new Library();
        int mayBe0 = library0.returnCopy(copy0, user0);
        System.out.println(mayBe0);
        return mayBe0;
    }

    
    public static  void test2(Book book0, Copy copy0, User user0)  throws Throwable  {
        Library library0 = new Library();
        library0.lendItem(copy0, user0);

    }
    public static void test4(Book book0)  throws Throwable  {
        Library library0 = new Library();
        library0.removeMedium(book0);
    }

    public static void test5( BluRay bluRay0)  throws Throwable  {
        Library library0 = new Library();
        MockDate mockDate0 = new MockDate();
        library0.createMedium(bluRay0);
    }
}

class MockDate extends Date { }
