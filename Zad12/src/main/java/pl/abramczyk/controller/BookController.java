package pl.abramczyk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.abramczyk.model.Book;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping
    public List<Book> getBooks(){
        return Arrays.asList(
                new Book("Sienkiewicz","W pustyni i w puszczy", 91024812),
                new Book("Sienkiewicz", "Krzyżacy", 23423490),
                new Book("Mickiewicz", "Pan Tadeusz", 28032032));
    }



}
