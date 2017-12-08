package spring_framework.proselyte_net.lesson_18.transactions.declarative.dao.jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import spring_framework.proselyte_net.lesson_18.transactions.declarative.dao.DeveloperDao;
import spring_framework.proselyte_net.lesson_18.transactions.declarative.model.Developer;
import spring_framework.proselyte_net.lesson_18.transactions.declarative.model.Project;
import spring_framework.proselyte_net.lesson_18.transactions.declarative.utils.DevelopersMapper;
import spring_framework.proselyte_net.lesson_18.transactions.declarative.utils.ProjectsMapper;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTemplateDeveloperDaoImpl implements DeveloperDao {
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void createDeveloper(String name, String specialty, Integer experience) {


        String SQL = "INSERT INTO DEVELOPERS (DEVELOPER_NAME, SPECIALTY, EXPERIENCE) VALUES (?,?,?)";
        jdbcTemplate.update(SQL, name, specialty, experience);
        System.out.println("Developer's record created/updated successfully. Name: " +
                name + ", Specilaty: " + specialty + ", Experience: " + experience + "\n");
    }

    @Override
    public List<Developer> listDevelopers() {
        String SQL = "SELECT * FROM DEVELOPERS";
        List<Developer> developers = jdbcTemplate.query(SQL, new DevelopersMapper());

        return developers;
    }

    @Override
    public List<Project> listDevelopersProjects(Integer id) {
        String SQL = "SELECT * FROM PROSELYTE_TUTORIAL.PROJECTS WHERE DEVELOPERS_ID = " + id;
        List<Project> projectList = jdbcTemplate.query(SQL, new ProjectsMapper());
        return projectList;
    }
}
