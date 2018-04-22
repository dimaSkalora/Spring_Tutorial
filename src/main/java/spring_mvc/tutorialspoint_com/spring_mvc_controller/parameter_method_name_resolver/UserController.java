package spring_mvc.tutorialspoint_com.spring_mvc_controller.parameter_method_name_resolver;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends MultiActionController {

    public ModelAndView home(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("message", "Home");
        return modelAndView;
    }

    public ModelAndView add(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("message","Add");
        return modelAndView;
    }

    public ModelAndView remove(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("message", "Remove");
        return modelAndView;
    }
}
