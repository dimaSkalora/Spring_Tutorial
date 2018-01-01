package spring_framework.wideskills_com.lesson_19.java_config.jdbc_dao_support;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class EmployeeJdbcDaoSupport extends JdbcDaoSupport {
    public int  getTotalNumberOfEmployees(){
        String sql = "select coun(*) from employee";
        //int count = getJdbcTemplate().queryForInt(sql);
        int count =55555;
        return count;
    }

    public Employee getEmployeeById(int id){
        String sql ="select * from employee where id = ?";
        Employee employee =   getJdbcTemplate().queryForObject(sql, new Object[]{new Integer(id)} , new EmployeeRowMapper());
        return employee;
    }

    public List<Employee> getAllEmployees(){
        String sql = "select* from employee";
        List<Employee> employees = getJdbcTemplate().query(sql, new EmployeeRowMapper());

        return employees;
    }

    public Employee updateEmployee(String name, int id){
        String sql ="update employee set name = ? where id = ?";
        getJdbcTemplate().update(sql, new Object[]{name,new Integer(id)});
        Employee emp = getEmployeeById(id);
        return emp;
    }

    public void insertEmployee(int id, String name , int age, int salary){
        String sql = "insert into Employee value (?,?,?,? )";
        getJdbcTemplate().update(sql, new Object[]{new Integer(id), name,new Integer(age),new Integer(salary) });
    }

    public void deleteEmployee(int id){
        String sql ="delete from employee where id = ?";
        getJdbcTemplate().update(sql, new Object[]{new Integer(id)});
    }

}
