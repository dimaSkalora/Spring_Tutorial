package spring_jdbc.tutorialspoint_com.advanced_jdbc_examples.handling_blob;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.DefaultLobHandler;

import java.io.ByteArrayInputStream;
import java.sql.Types;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void updateImage(Integer id, byte[] imageData) {
        MapSqlParameterSource in = new MapSqlParameterSource();
        in.addValue("id", id);
        in.addValue("image",  new SqlLobValue(new ByteArrayInputStream(imageData),
                imageData.length, new DefaultLobHandler()), Types.BLOB);

        String SQL = "update student_blob_tutorialspoint_com set image = :image where id = :id";
        NamedParameterJdbcTemplate jdbcTemplateObject = new
                NamedParameterJdbcTemplate(dataSource);

        jdbcTemplateObject.update(SQL, in);
        System.out.println("Updated Record with ID = " + id );
    }
}
