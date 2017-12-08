package spring_framework.proselyte_net.lesson_18.transactions.programmatic.utils;

import org.springframework.jdbc.core.RowMapper;
import spring_framework.proselyte_net.lesson_18.transactions.programmatic.model.Project;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectsMapper implements RowMapper<Project> {
    @Override
    public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
        Project project = new Project();

        project.setDevelopersId(rs.getInt("developersId"));
        project.setProjectName(rs.getString("projectName"));
        project.setCompanyName(rs.getString("companyName"));

        return project;
    }
}
