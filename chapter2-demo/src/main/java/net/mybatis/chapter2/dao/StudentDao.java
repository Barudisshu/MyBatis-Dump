package net.mybatis.chapter2.dao;

import net.mybatis.chapter2.model.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * @author Barudisshu
 */
public interface StudentDao {

    @Select("SELECT * FROM t_student WHERE id=#{id}")
    @ResultMap("BaseResultMap")
    Student getStudentById(@Param("id") int id);

    @Select("SELECT * FROM t_student WHERE stuName=#{name}")
    @Results(value = {
            @Result(id = true, property = "id", column = "id", jdbcType = JdbcType.TINYINT),
            @Result(column = "stuName", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "age", property = "age", jdbcType = JdbcType.TINYINT),
            @Result(column = "sex", property = "sex", jdbcType = JdbcType.CHAR),
            @Result(column = "gradeName", property = "gradename", jdbcType = JdbcType.VARCHAR)
    })
    Student getStudentByName(@Param("name") String name);
}
