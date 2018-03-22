package spring_jdbc.tutorialspoint_com.spring_jdbc_batch_examples.multiple_batches_operation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("SpringJDBC/tutorialspoint_com/Spring_JDBC_Batch_Examples/Multiple_Batches_Operation/multipleBatchesOperation-beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");

        List<Student> initialStudents = studentJDBCTemplate.listStudents();
        System.out.println("Initial Students");

        for(Student student2: initialStudents){
            System.out.print("ID : " + student2.getId() );
            System.out.println(", Age : " + student2.getAge());
        }

        Student student = new Student();
        student.setId(1);
        student.setAge(17);

        Student student1 = new Student();
        student1.setId(3);
        student1.setAge(18);

        List<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student1);
        studentJDBCTemplate.batchUpdate(students);

        List<Student> updatedStudents = studentJDBCTemplate.listStudents();
        System.out.println("Updated Students");

        for(Student student3: updatedStudents){
            System.out.print("ID : " + student3.getId() );
            System.out.println(", Age : " + student3.getAge());
        }
    }
}
