package spring_framework.proselyte_net.lesson_18.transactions.programmatic.utils;

import org.springframework.jdbc.core.RowMapper;
import spring_framework.proselyte_net.lesson_18.transactions.programmatic.model.Developer;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DevelopersMapper implements RowMapper<Developer> {
    @Override
    public Developer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Developer developer = new Developer();

        developer.setId(rs.getInt("id"));
        developer.setName(rs.getString("developer_name"));
        developer.setSpecialty(rs.getString("specialty"));
        developer.setExperience(rs.getInt("experience"));

        return developer;
    }
}
