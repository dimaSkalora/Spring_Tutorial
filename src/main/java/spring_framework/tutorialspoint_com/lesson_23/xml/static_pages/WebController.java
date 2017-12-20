package spring_framework.tutorialspoint_com.lesson_23.xml.static_pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping(value = "/indexGet", method = RequestMethod.GET)
    public String index() {
        return "indexGet";
    }
    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/pages/final.html";
    }

}
