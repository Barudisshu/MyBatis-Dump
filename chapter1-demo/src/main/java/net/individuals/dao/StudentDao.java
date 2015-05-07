package net.individuals.dao;

import net.individuals.model.Student;

import java.util.List;

public interface StudentDao {

    public int deleteByPrimaryKey(int id);

    public int insert(Student record);

    public int insertSelective(Student record);

    public Student selectByPrimaryKey(int id);

    public int updateByPrimaryKeySelective(Student record);

    public int updateByPrimaryKey(Student record);

    public List<Student> getAll();
}