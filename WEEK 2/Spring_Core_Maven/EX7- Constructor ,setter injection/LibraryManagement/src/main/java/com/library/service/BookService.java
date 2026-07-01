package com.library.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.repository.BookRepository;
@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Injection Executed");
    }
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection Executed");
    }

    public void showBooks() {

        System.out.println("Book Service");

        bookRepository.displayBooks();

    }
}
