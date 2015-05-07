package net.individuals.service;

import net.individuals.dao.StudentDao;
import net.individuals.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Barudisshu
 */
@Service
public class StudentService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private StudentDao studentDao;

    public int insertStudent(Student student) {
        return studentDao.insert(student);
    }

    public Student findStudentById(int id) {
        return studentDao.selectByPrimaryKey(id);
    }

    public List<Student> getAll() {
        return studentDao.getAll();
    }
}
