package net.mybatis.chapter2.service;

import net.mybatis.chapter2.dao.StudentDao;
import net.mybatis.chapter2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Barudisshu
 */
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public Student getStudentByName(String name) {
        return studentDao.getStudentByName(name);
    }
}
