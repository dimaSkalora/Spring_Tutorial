package spring_framework.wideskills_com.lesson_21.xml.register;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserRegistrationController {
    @RequestMapping("/register")
    public String setForm(Model model)
    {
        Map<String,String> country = new HashMap<String,String>();
        country.put("India","India");
        country.put("United States","United States");
        country.put("United Kingdom","United Kingdom");

        model.addAttribute("country", country);

        User user = new User();
        model.addAttribute("user", user);
        return "inputForm";
    }

    @RequestMapping(value = "/register" ,method = RequestMethod.POST)
    public String submit(@ModelAttribute("user") User user , Model model)
    {

        String name = user.getName();
        String contactNumber = user.getContactNumber();
        String country = user.getCountry();

        model.addAttribute("name",name);
        model.addAttribute("contactNumber",contactNumber);

        model.addAttribute("country",country);

        return "confrmationScreen";
    }
}
