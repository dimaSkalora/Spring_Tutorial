package spring_framework.wideskills_com.lesson_22.xml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class AccessingRestWebService {
    @RequestMapping("/getStudent/{studentId}")
    public @ResponseBody Student getStudent(@PathVariable("studentId") String studentId) {

        RestTemplate restTemplate = new RestTemplate() ;
        Student result = restTemplate.getForObject("http://localhost:8080/RestfulWebService/student/{id}",Student.class,studentId);
        return result;
    }

    @RequestMapping("/getStudents")
    public @ResponseBody List<Student> getStudents() {
        RestTemplate restTemplate = new RestTemplate() ;
        List<Student> result = restTemplate.getForObject("http://localhost:8080/RestfulWebService/students",List.class);
        return result;
    }

    @RequestMapping("/createStudent")
    public @ResponseBody Student createStudent ()
    {

        Student student = new Student();
        student.setContactNumber("1230-9990-333");
        student.setCourse("electronics");
        student.setName("Student XY");
        student.setStudentID("ABCD");

        RestTemplate restTemplate = new RestTemplate() ;
        Student result = restTemplate.postForObject("http://localhost:8080/RestfulWebService/student/add",student,Student.class);
        return result;
    }
}
