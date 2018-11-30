package sample.spring.tobyi.ch10;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Rene on 2018. 10. 24..
 * auth : Rene
 */
@Configuration
public class AnnotatedHelloConfig {

    private Logger logger = Logger.getLogger("tobyiLog");

    public AnnotatedHelloConfig() {
        logger.info("AnnotatedHelloConfig constructor");
    }

    @Bean
    public AnnotatedHello annotatedHello() {
        return new AnnotatedHello();
    }
}
