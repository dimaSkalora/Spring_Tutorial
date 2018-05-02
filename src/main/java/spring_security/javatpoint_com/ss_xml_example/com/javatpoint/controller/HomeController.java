package spring_security.javatpoint_com.ss_xml_example.com.javatpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value="/admin_ss_xml_example", method=RequestMethod.GET)
    public String privateHome() {
        return "privatePage";
    }
}
