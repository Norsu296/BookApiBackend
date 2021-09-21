package pl.kuba.bookapi.service;

import pl.kuba.bookapi.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getBooks();
    Optional<Book> getById(Long id);
    void add(Book book);
    void update(Book book);
    void deleteById(Long id);

}
