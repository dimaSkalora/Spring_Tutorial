package spring_framework.wideskills_com.lesson_19.java_config.jdbc_template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_19.java_config.beans.JdbcTemplateBeans;

import java.util.List;

public class TestEmployeeJdbcTemplate {

    public static void main(String args[]){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(JdbcTemplateBeans.class);
        EmployeeJdbcTemplate employeeJdbcTemplate =
                (EmployeeJdbcTemplate)context.getBean("employeeJdbcTemplate");

        // Display current state of Employee table
        List<Employee> emp = employeeJdbcTemplate.getAllEmployees();
        System.out.println("Current State of employee table -");
        System.out.println(emp);

        // insert new employee
        employeeJdbcTemplate.insertEmployee(201, "Employee B", 31, 2000);

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
