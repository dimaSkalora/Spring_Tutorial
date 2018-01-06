package spring_framework.wideskills_com.lesson_21.xml.interceptors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloController {
    @RequestMapping("/messageInterceptor")
    public String sayHello(HttpServletRequest requst , Model model)
    {
        String messageFromInterceptor= (String)requst.getAttribute("preHandleMessage");

        model.addAttribute("preHandleMessage", messageFromInterceptor);
        model.addAttribute("controllerMessage", "Message From Controller");

        return "interceptors";
    }
}
