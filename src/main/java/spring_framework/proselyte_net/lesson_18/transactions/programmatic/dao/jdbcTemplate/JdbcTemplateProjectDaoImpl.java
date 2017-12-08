package spring_framework.proselyte_net.lesson_18.transactions.programmatic.dao.jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import spring_framework.proselyte_net.lesson_18.transactions.programmatic.dao.ProjectDao;

import javax.sql.DataSource;

public class JdbcTemplateProjectDaoImpl implements ProjectDao {
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
    public void createProject(Integer developerId, String projectName, String companyName) {
        TransactionDefinition definition = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(definition);

        String SQL = "INSERT INTO PROJECTS (developerId, projectName, companyName) VALUES (?,?,?)";
        jdbcTemplate.update(SQL, developerId, projectName, companyName);
        System.out.println("Project record created successfully. Project name: " +
                projectName + ", Company: " + companyName + "\n");
        transactionManager.commit(status);
    }
}
