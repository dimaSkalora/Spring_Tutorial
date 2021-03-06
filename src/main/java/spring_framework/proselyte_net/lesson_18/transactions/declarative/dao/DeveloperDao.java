package spring_framework.proselyte_net.lesson_18.transactions.declarative.dao;

import spring_framework.proselyte_net.lesson_18.transactions.declarative.model.Developer;
import spring_framework.proselyte_net.lesson_18.transactions.declarative.model.Project;

import javax.sql.DataSource;
import java.util.List;

public interface DeveloperDao {
    public void setDataSource(DataSource dataSource);

    public void createDeveloper(String name, String specialty, Integer experience);

    public List<Developer> listDevelopers();

    public List<Project> listDevelopersProjects(Integer id);
}
