package net.individuals.controller;

import com.alibaba.fastjson.JSON;
import net.individuals.model.BookType;
import net.individuals.service.BookTypeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Barudisshu
 */
@Controller
public class BookTypeController {

    private static final Logger logger = Logger.getLogger(BookTypeController.class);

    @Autowired
    private BookTypeService bookTypeService;

    @RequestMapping(value = "rest/booktypes", method = RequestMethod.GET)
    public String getBookTypeAll(Model model) {
        logger.info("获取图书所有信息：");
        List<BookType> bookTypeList = bookTypeService.getAll2();
        String bookTypeMsg = JSON.toJSONString(bookTypeList);
        model.addAttribute("bookTypeMsg", bookTypeMsg);
        return "booktypeAll";
    }

}
