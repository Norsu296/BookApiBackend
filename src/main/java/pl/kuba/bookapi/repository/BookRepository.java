package pl.kuba.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kuba.bookapi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
}
