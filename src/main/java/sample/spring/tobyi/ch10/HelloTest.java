package sample.spring.tobyi.ch10;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by Rene on 2018. 10. 12..
 * auth : Rene
 */
public class HelloTest {
    public static void main(String[] args) {

        /*
        GenericApplicationContext context = new GenericApplicationContext();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(context);
        reader.loadBeanDefinitions("META-INF/tobyispringApplicationContext.xml");

        context.refresh();
        */

//      ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/tobyispringApplicationContext.xml");

        GenericXmlApplicationContext context = new GenericXmlApplicationContext("META-INF/tobyispringApplicationContext.xml");

        Hello hello = context.getBean("hello", Hello.class);
        //hello.sayHello();
        hello.print();
    }
}
