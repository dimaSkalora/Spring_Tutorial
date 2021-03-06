package spring_framework.wideskills_com.lesson_19.xml.jdbc_template;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestEmployeeJdbcTemplate {

    public static void main(String args[]){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("SpringFramework/wideskills_com/Lesson_19/jdbcTemplate-beans.xml");
        EmployeeJdbcTemplate employeeJdbcTemplate =
                (EmployeeJdbcTemplate)context.getBean("employeeJdbcTemplate");

        // Display current state of Employee table
        List<Employee> emp = employeeJdbcTemplate.getAllEmployees();
        System.out.println("Current State of employee table -");
        System.out.println(emp);

        // insert new employee
        employeeJdbcTemplate.insertEmployee(200, "Employee B", 31, 2000);

        // Display inserted employee
        Employee insertedEmployee = employeeJdbcTemplate.getEmployeeById(200);
        System.out.println("Inserted Employee Information from Employee Table - ");
        System.out.println(insertedEmployee);

        // update employee
        Employee updatedEmployee =         employeeJdbcTemplate.updateEmployee("Employee B updated ", 200);
        System.out.println("Updated Employee Information from Employee Table - ");
        System.out.println(updatedEmployee);

        //delete employee
        employeeJdbcTemplate.deleteEmployee(100);

        // display total number of employees
        int count = employeeJdbcTemplate.getTotalNumberOfEmployees();
        System.out.println("Total number of Employees in employee table ");
        System.out.println(count);

        emp = employeeJdbcTemplate.getAllEmployees();
        System.out.println("Current State of employee table -");
        System.out.println(emp);
    }
}
