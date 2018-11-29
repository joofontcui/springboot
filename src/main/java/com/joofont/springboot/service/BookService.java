package com.joofont.springboot.service;

import com.joofont.springboot.entity.Book;

import java.util.List;

/**
 * @author cui jun on 2018/10/28.
 * @version 1.0
 */
public interface BookService {

    Book getById(Integer id);

    List<Book> getAllBooks();
}
