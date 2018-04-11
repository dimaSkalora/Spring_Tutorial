package spring_mvc.tutorialspoint_com.spring_mvc_form_handling.page_redirection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping(value = "/indexPage",method = RequestMethod.GET)
    public String indexPage(){
        return "indexPage";
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect(){
        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage(){
        return "final";
    }
}
