package spring_mvc.tutorialspoint_com.spring_mvc_handler_mapping.controller_class_name_handler_mapping;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("message","Hello World!");
        return model;
    }
}
