package com.example.memorydb.book.controller;

import com.example.memorydb.book.entity.BookEntity;
import com.example.memorydb.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookApiController {

    private final BookService bookService;


    @PutMapping("")
    public BookEntity create(@RequestBody BookEntity bookEntity){
        return bookService.create(bookEntity);
    }

    @GetMapping("/all")
    public List<BookEntity> findAll(){
        return bookService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }

    @GetMapping("/id")
    public BookEntity findOne(@RequestParam Long id){
       Optional<BookEntity> bookEntity = bookService.findOne(id);
       return bookEntity.get();
    }
}
