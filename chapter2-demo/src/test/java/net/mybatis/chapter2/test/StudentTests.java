package net.mybatis.chapter2.test;

import com.alibaba.fastjson.JSON;
import net.mybatis.chapter2.model.Student;
import net.mybatis.chapter2.service.StudentService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Barudisshu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class StudentTests {

    private static final Logger logger = Logger.getLogger(StudentTests.class);

    @Autowired
    private StudentService studentService;

    @Test
    public void test(){
        Student student = studentService.getStudentByName("张三");
        logger.info(JSON.toJSON(student));
    }
}
