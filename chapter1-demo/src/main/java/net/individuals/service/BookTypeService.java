package net.individuals.service;

import net.individuals.dao.BookTypeDao;
import net.individuals.model.BookType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Barudisshu
 */
@Service
public class BookTypeService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private BookTypeDao bookTypeDao;

    public List<BookType> getAll(){
        return bookTypeDao.getAll();
    }

    public List<BookType> getAll2(){
        return bookTypeDao.getAll2();
    }
}
