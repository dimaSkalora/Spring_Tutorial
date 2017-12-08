package spring_framework.proselyte_net.lesson_17.jdbc.dao;

import spring_framework.proselyte_net.lesson_17.jdbc.model.Developer;

import javax.sql.DataSource;
import java.util.List;

public interface DeveloperDAO {
    public void setDataSource(DataSource dataSource);

    public void createDeveloper(String name, String specialty, Integer experience);

    public Developer getDeveloperById(Integer id);

    public List listDevelopers();

    public void removeDeveloper(Integer id);

    public void updateDeveloper(Integer id, String name, String specialty, Integer experience);
}

