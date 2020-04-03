package bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(conf.class);
        String[] beanDefinitionNames = a.getBeanDefinitionNames();
        for (String s : beanDefinitionNames) {
            System.out.println(s);
        }

        tx tx = (bean.tx) a.getBean("tx");
        tx.doit();

    }


}
