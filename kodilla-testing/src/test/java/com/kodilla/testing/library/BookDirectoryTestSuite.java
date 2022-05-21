package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<>();
        for (int i=1; i<=booksQuantity; i++){
            Book theBook = new Book("Title" +i,"Author" +i,1900+i);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;
    @Test
    void testListBooksWithConditionsReturnList(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);                                                    // [9]
        resultListOfBooks.add(book2);                                                    // [10]
        resultListOfBooks.add(book3);                                                    // [11]
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4,theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20(){
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
        //When
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        //Then
        assertEquals(0,theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        //Then
        assertEquals(0,theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOf(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultOf0Books = new ArrayList<>();
        List<Book> resultOf1Books = generateListOfNBooks(1);
        List<Book> resultOf5Books = generateListOfNBooks(5);

        LibraryUser user0 = new LibraryUser("user0","zero","123123");
        LibraryUser user1 = new LibraryUser("user1","one","321312");
        LibraryUser user5 = new LibraryUser("user5","five","332211");

        when(libraryDatabaseMock.listBooksInHandsOf(user0)).thenReturn(resultOf0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultOf1Books);
        when(libraryDatabaseMock.listBooksInHandsOf(user5)).thenReturn(resultOf5Books);
        //When
        List<Book> listOf0Books = bookLibrary.listBooksInHandsOf(user0);
        List<Book> listOf1Books = bookLibrary.listBooksInHandsOf(user1);
        List<Book> listOf5Books = bookLibrary.listBooksInHandsOf(user5);
        //Then
        assertEquals(0,listOf0Books.size());
        assertEquals(1,listOf1Books.size());
        assertEquals(5,listOf5Books.size());
    }
}
