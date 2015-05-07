package net.individuals.controller;

import com.alibaba.fastjson.JSON;
import net.individuals.model.Student;
import net.individuals.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Barudisshu
 */
@Controller
public class StudentController {

    private static final Logger logger = Logger.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/rest/student/{id}", method = RequestMethod.GET)
    public String getStudent(@PathVariable("id") int id, Model model) {
        logger.info("从URI获取学生信息：" + id);
        Student student = studentService.findStudentById(id);
        //将Object转换为JSON字符串
        String studentMsg = JSON.toJSONString(student);
        model.addAttribute("studentMsg", studentMsg);
        //将JSON字符串转换为Object对象
        Student stuObj = JSON.toJavaObject(JSON.parseObject(studentMsg),Student.class);
        model.addAttribute("stuObj", stuObj);
        return "student";
    }

    @RequestMapping(value = "rest/students",method = RequestMethod.GET)
    public String getStuAll(Model model){
        logger.info("查询所有学生信息：");
        List<Student> studentList = studentService.getAll();
        //将List转换为JSON字符串
        String studentListMsg = JSON.toJSONString(studentList);
        model.addAttribute("studentListMsg",studentListMsg);
        return "stuAll";
    }
}
