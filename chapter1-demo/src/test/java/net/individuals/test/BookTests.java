package net.individuals.test;

import com.alibaba.fastjson.JSON;
import net.individuals.model.Book;
import net.individuals.service.BookService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Barudisshu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class BookTests {

    private static final Logger logger = Logger.getLogger(BookTests.class);

    @Autowired
    private BookService bookService;

    @Test
    public void queryAllTests(){
        List<Book> bookList = bookService.getAll();
        logger.info(JSON.toJSONString(bookList));
    }
}
