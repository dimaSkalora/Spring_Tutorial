package spring_framework.wideskills_com.lesson_21.xml;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHello(Model model)
    {
        model.addAttribute("welcomeMessage", "Hello user  !!");
        return "welcome";
    }

    @RequestMapping("/greeting")
    public void sayHi(Model model)
    {
        model.addAttribute("welcomeMessage", "Hi User !!");
    }
}
