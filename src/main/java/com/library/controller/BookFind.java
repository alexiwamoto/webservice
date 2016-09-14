package com.library.controller;

import com.library.controller.dao.BookDao;
import com.library.model.Book;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class BookFind {

    private BookDao bookDao;

    public BookFind() {
    }

    @WebMethod(operationName = "search")
    public Book search(@WebParam(name = "bookName")String num){
        bookDao = new BookDao();
        return bookDao.searchBook(num);
    }
}

