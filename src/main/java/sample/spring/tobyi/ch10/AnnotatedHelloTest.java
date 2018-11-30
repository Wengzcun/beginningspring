package sample.spring.tobyi.ch10;

import javafx.application.Application;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rene on 2018. 10. 24..
 * auth : Rene
 */
public class AnnotatedHelloTest {
    static  Logger logger = Logger.getLogger("tobyiLog");

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotatedHelloConfig.class);
        ctx.getBean("annotatedHello", AnnotatedHello.class);
        AnnotatedHelloConfig config = ctx.getBean("annotatedHelloConfig", AnnotatedHelloConfig.class);
        logger.info("config :: " + config);
    }
}
