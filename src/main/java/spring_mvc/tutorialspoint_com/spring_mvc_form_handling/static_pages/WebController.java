package spring_mvc.tutorialspoint_com.spring_mvc_form_handling.static_pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping(value = "/indexPage",method = RequestMethod.GET)
    public String indexPage(){
        return "indexPage";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/pages/final.html";
    }

}
