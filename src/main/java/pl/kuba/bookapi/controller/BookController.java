package pl.kuba.bookapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.kuba.bookapi.entity.Book;
import pl.kuba.bookapi.service.JpaBookService;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final JpaBookService jpaBookService;

    @GetMapping
    public List<Book> findAll(){
        return jpaBookService.getBooks();
    }
    @GetMapping("/{id}")
    public Optional<Book> findById(@PathVariable Long id){
        return jpaBookService.getById(id);
    }
    @PostMapping("/add")
    public void add(@RequestBody Book book){
        jpaBookService.add(book);
    }
    @PutMapping
    public void update(@RequestBody Book book){
        jpaBookService.update(book);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        jpaBookService.deleteById(id);
    }



}
