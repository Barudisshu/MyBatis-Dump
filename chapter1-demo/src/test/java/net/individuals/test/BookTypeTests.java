package net.individuals.test;

import com.alibaba.fastjson.JSON;
import net.individuals.model.BookType;
import net.individuals.service.BookTypeService;
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

public class BookTypeTests {

    @Autowired
    private BookTypeService bookTypeService;

    private static final Logger logger = Logger.getLogger(BookTypeTests.class);

    @Test
    public void queryAllTests(){
        //不推荐使用第一种方法，效率低下
        //List<BookType> bookTypeList = bookTypeService.getAll();
        //推荐使用第二种方法，即添加OffType指定关联对象
        List<BookType> bookTypeList = bookTypeService.getAll2();
        logger.info(JSON.toJSONString(bookTypeList));
    }
}
