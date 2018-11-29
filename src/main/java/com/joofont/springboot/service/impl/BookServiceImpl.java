package com.joofont.springboot.service.impl;

import com.joofont.springboot.dao.BookMapper;
import com.joofont.springboot.entity.Book;
import com.joofont.springboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cui jun on 2018/10/28.
 * @version 1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public Book getById(Integer id) {
        return bookMapper.getById(id);
    }

    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

}
