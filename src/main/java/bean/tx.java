package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Transactional
@Component
public class tx {
    @Autowired
    DataSource dataSource;

    public tx(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void doit() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println("ddd");
        String sql = "insert into student values(null,'tx',2)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.execute();
        int i = 10 / 0;
    }
}
