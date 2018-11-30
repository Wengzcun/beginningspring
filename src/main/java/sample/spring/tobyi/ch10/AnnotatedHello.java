package sample.spring.tobyi.ch10;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by Rene on 2018. 10. 24..
 * auth : Rene
 */
@Component
public class AnnotatedHello {

    private Logger logger = Logger.getLogger("tobyiLog");

    public AnnotatedHello() {
        logger.info("annotatedHello constructor");
    }
}
