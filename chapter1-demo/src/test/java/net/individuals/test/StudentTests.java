package net.individuals.test;

import com.alibaba.fastjson.JSON;
import net.individuals.model.Student;
import net.individuals.service.StudentService;
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
public class StudentTests {

    private static final Logger logger = Logger.getLogger(StudentTests.class);

    @Autowired
    private StudentService studentService;

    @Test
    public void queryTests(){
        Student student = studentService.findStudentById(1);
        logger.info(JSON.toJSONString(student));
    }

    @Test
    public void queryAllTests(){
        List<Student> studentList = studentService.getAll();
        logger.info(JSON.toJSONString(studentList));
    }
}
