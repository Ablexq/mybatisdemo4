package com.example.demo;

import com.example.demo.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookDao bookDao;

    @RequestMapping("/getAll")
    public ModelAndView getBook(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("list",bookDao.getAll());
        mav.setViewName("book");
        return mav;
    }

}
