package spring_framework.wideskills_com.lesson_22.xml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentRestServiceController {

    private static Map<String,Student> studentsData = new HashMap<String,Student>();

    @RequestMapping("/students")
    public @ResponseBody List<Student> getAllStudents()
    {

        Set<String> set = studentsData.keySet();
        Iterator<String> it = set.iterator();
        List<Student> students = new ArrayList<Student>();
        while(it.hasNext())
        {
            String id = it.next();
            students.add(studentsData.get(id));
        }
        return students;
    }
    @RequestMapping("/student/{studentId}")
    public @ResponseBody Student getStudent(@PathVariable("studentId") String id)
    {
        return studentsData.get(id);
    }
    @RequestMapping(value ="/student/delete/{studentId}" ,method=RequestMethod.DELETE)
    public @ResponseBody Student deleteStudent(@PathVariable("studentId") String id)
    {
        return studentsData.remove(id);
    }

    @RequestMapping(value ="/student/add" ,method=RequestMethod.POST)
    public @ResponseBody Student  addStudent(@RequestBody Student studnet)
    {
        studentsData.put(studnet.getStudentID(), studnet);
        return studnet;
    }
}
