package sample.spring.tobyi.ch10;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Rene on 2018. 10. 12..
 */
public class Hello {

    private Logger logger = Logger.getLogger("tobyiLog");


    private String name;
    private int age;

    private Printer printer;

    public Hello() {

    }

    public Hello(String name) {
        this.name = name;
        logger.info("call constructor!!");
    }

    public void setName(String name) {
        this.name = name;
        logger.info("call set method");
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Autowired
//    public void setPrinter(Map<String, Printer> printer) {
//        this.printer = printer.get("sprinter");
//    }

    @Autowired
    public void setPrinter(@Qualifier("cprinter") Printer printer) {
        this.printer = printer;
    }

    public String sayHello() {
        logger.info("call sayHello");

        return "Hello " + name + "(" + age + ")";
    }

    public void print() {
        logger.info("call print");
        logger.debug("name :: " + name);
        logger.debug("printer :: " + printer);

        this.printer.print(sayHello());
    }

}


