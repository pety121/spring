package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ApplicationContext a = new ClassPathXmlApplicationContext("spring.xml");
        student student = (bean.student) a.getBean("student");
        System.out.println(student.toString());
        Map<Integer,String> aa = new HashMap<>();
        aa.put(1,"dd");
        aa.put(1,"ddd");
    }
}
