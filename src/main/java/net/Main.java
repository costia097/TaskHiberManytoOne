package net;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springMvc.xml");
        Logic logic = (Logic) context.getBean("logic");

        logic.method();

    }
}
