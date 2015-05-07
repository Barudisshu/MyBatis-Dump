package net.individuals.service;

import net.individuals.dao.BookDao;
import net.individuals.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Barudisshu
 */
@Service
public class BookService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private BookDao bookDao;


    public Book findbyId(int id){
        return bookDao.selectByPrimaryKey(id);
    }

    public List<Book> getAll(){
        return bookDao.getAll();
    }
}
