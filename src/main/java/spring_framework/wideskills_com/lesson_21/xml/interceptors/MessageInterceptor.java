package spring_framework.wideskills_com.lesson_21.xml.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MessageInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response , Object handler, Exception exception )
            throws Exception {
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception
    {
        modelAndView.addObject("postHandleMessage", "Message From Post Handle Method");
    }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)
            throws Exception
    {
        String message = "Message from Pre Handle Method";
        request.setAttribute("preHandleMessage", message);
        return true;
    }
}
