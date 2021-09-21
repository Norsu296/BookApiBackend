package pl.kuba.bookapi.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
@Data
public class Book{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 13, max = 13)
    private String isbn;
    @Size(min = 3)
    private String title;
    @Size(min = 3)
    private String author;
    @Size(min = 3)
    private String publisher;
    @Size(min = 3)
    private String type;
}
