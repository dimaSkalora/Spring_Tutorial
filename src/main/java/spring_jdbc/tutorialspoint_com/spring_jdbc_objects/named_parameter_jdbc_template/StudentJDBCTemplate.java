package spring_jdbc.tutorialspoint_com.spring_jdbc_objects.named_parameter_jdbc_template;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.DefaultLobHandler;

import javax.sql.DataSource;
import java.sql.Types;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void updateDescription(Integer id, String description) {
        MapSqlParameterSource in = new MapSqlParameterSource();
        in.addValue("id", id);
        in.addValue("description",  new SqlLobValue(
                description, new DefaultLobHandler()), Types.CLOB);

        String SQL = "update student_clob_tutorialspoint_com set description = :description where id = :id";
        NamedParameterJdbcTemplate jdbcTemplateObject =
                new NamedParameterJdbcTemplate(dataSource);

        jdbcTemplateObject.update(SQL, in);
        System.out.println("Updated Record with ID = " + id );
    }
}