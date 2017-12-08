package spring_framework.proselyte_net.lesson_18.transactions.programmatic.dao.jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import spring_framework.proselyte_net.lesson_18.transactions.programmatic.dao.DeveloperDao;
import spring_framework.proselyte_net.lesson_18.transactions.programmatic.model.Developer;
import spring_framework.proselyte_net.lesson_18.transactions.programmatic.model.Project;
import spring_framework.proselyte_net.lesson_18.transactions.programmatic.utils.DevelopersMapper;
import spring_framework.proselyte_net.lesson_18.transactions.programmatic.utils.ProjectsMapper;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTemplateDeveloperDaoImpl implements DeveloperDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private PlatformTransactionManager transactionManager;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    @Override
    public void createDeveloper(String name, String specialty, Integer experience) {
        TransactionDefinition definition =
                new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(definition);

        String SQL = "INSERT INTO DEVELOPERS (DEVELOPER_NAME, SPECIALTY, EXPERIENCE) VALUES (?,?,?)";
        jdbcTemplate.update(SQL, name, specialty, experience);
        System.out.println("Developer's record created/updated successfully. Name: " +
                name + ", Specilaty: " + specialty + ", Experience: " + experience + "\n");
        transactionManager.commit(status);
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
