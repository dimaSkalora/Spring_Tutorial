package spring_framework.wideskills_com.lesson_20.xml.programmatic_transaction;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuyProduct {
    private JdbcTemplate jdbcTemplate;
    private PlatformTransactionManager transactionManager;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void setTransactionManager(PlatformTransactionManager transactionManager){
        this.transactionManager=transactionManager;
    }

    public void buyProduct(String username , int productId){
        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);
        try
        {
            /*int price = jdbcTemplate.queryForInt
                    ( "SELECT PRICE FROM PRODUCTS WHERE Id = ?",new Object[] { new Integer(productId) });
            jdbcTemplate.update("UPDATE PRODUCTS SET STOCK = STOCK - 1 WHERE ID = ?", new Object[] { new Integer(productId) });
            jdbcTemplate.update( "UPDATE ACCOUNT SET AMOUNT = AMOUNT - ?  WHERE USERNAME = ?", new Object[] { price, username });*/
            transactionManager.commit(status);
        }
        catch (DataAccessException e){
            transactionManager.rollback(status);
            throw e;
        }
    }
    public void displayState(String username, int productId){
        System.out.println("Database state after purchase ");
        ProductAccount product = jdbcTemplate.queryForObject
                ("SELECT * FROM products_account WHERE ID = ? ", new Object[]{new Integer(productId)},
                        new RowMapper<ProductAccount>() {
                            @Override
                            public ProductAccount mapRow(ResultSet rs, int row)
                                    throws SQLException {
                                ProductAccount product = new ProductAccount();
                                product.setPrice(rs.getInt("price"));
                                product.setProductId(rs.getInt("id"));
                                product.setProductName(rs.getString("name"));
                                product.setStock(rs.getInt("stock"));
                                return product;
                            }
                        } );
        System.out.println(product);
        Account account = jdbcTemplate.queryForObject
                ("SELECT * FROM ACCOUNT WHERE USERNAME = ? ", new Object[]{username},
                        new RowMapper<Account>() {
                            @Override
                            public Account mapRow(ResultSet rs, int row)
                                    throws SQLException {
                                Account  account = new Account();
                                account.setBalance(rs.getInt("amount"));
                                account.setUsername(rs.getString("username"));
                                return account;
                            }
                        } );
        System.out.println(account);
    }
}
