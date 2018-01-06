package spring_framework.wideskills_com.lesson_21.xml.spring_exception_resolver;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetDataController {
    @RequestMapping("/getData")
    public String getData(HttpServletRequest requst , Model model)
    {
        NoDataException exception = new NoDataException();
        exception.setMessage("Error Occured while Fetching Data !!");
        throw exception;
    }
}
