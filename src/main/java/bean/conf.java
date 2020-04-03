package bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


@EnableTransactionManagement
@EnableAspectJAutoProxy
@ComponentScan("bean")
@Configuration
public class conf {

    @Bean
    public student s() {
        student s = new student();
        s.setId(3);
        s.setName("dnikd");

        return s;
    }

    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource d = new ComboPooledDataSource();
        d.setDriverClass("com.mysql.jdbc.Driver");
        d.setUser("root");
        d.setPassword("qaz");
        d.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        return d;
    }

    @Bean
    public PlatformTransactionManager dataSourceTransactionManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(dataSource());
    }
}
