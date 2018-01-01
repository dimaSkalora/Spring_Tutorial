package spring_framework.wideskills_com.lesson_19.java_config.jdbc_dao_support;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_framework.wideskills_com.lesson_19.java_config.beans.JdbcDaoSupportBeans;

import java.util.List;

public class TestEmployeeJdbcDaoSupport {
    public static void main(String args[]){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(JdbcDaoSupportBeans.class);
        EmployeeJdbcDaoSupport employeeJdbcTemplate =
                (EmployeeJdbcDaoSupport)context.getBean("employeeJdbcDaoSupport");

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
        Employee updatedEmployee = employeeJdbcTemplate.updateEmployee("Employee B updated ", 200);
        System.out.println("Updated Employee Information from Employee Table - ");
        System.out.println(updatedEmployee);

        //delete employee
        employeeJdbcTemplate.deleteEmployee(100);

        // display total number of employees
        int count = employeeJdbcTemplate.getTotalNumberOfEmployees();
        System.out.println("total number of employees : " + count);
        emp = employeeJdbcTemplate.getAllEmployees();
        System.out.println("Current State of employee table -");
        System.out.println(emp);
    }
}
