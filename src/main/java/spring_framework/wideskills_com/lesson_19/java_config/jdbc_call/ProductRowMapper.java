package spring_framework.wideskills_com.lesson_19.java_config.jdbc_call;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();

        product.setProductId(resultSet.getInt("id"));
        product.setProductName(resultSet.getString("name"));
        product.setBrand(resultSet.getString("brand"));
        product.setPrice(resultSet.getInt("price"));

        return product;
    }
}
