package sample.spring.tobyi.ch10;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rene on 2018. 10. 15..
 * auth : Rene
 */
public class HierarchyTest {

    public static void main(String[] args) {
        ApplicationContext parent = new GenericXmlApplicationContext("META-INF/hierarchytest/parentContext.xml");

//        List<String> xmlLocation = new ArrayList<String>();
//        xmlLocation.add("META-INF/hierarchytest/childContext.xml");

//        String[] xmlLocation = new String[1];
//        xmlLocation[0] = "META-INF/hierarchytest/childContext.xml";

//        ClassPathXmlApplicationContext child = new ClassPathXmlApplicationContext(new ArrayList<String>().add("META-INF/hierarchytest/childContext.xml").toArray(new String[]{}), parent);


        GenericApplicationContext child = new GenericApplicationContext(parent);

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(child);
        reader.loadBeanDefinitions("META-INF/hierarchytest/childContext.xml");
        child.refresh();

        Printer printer = child.getBean("cprinter", Printer.class);
        Hello hello = child.getBean("hello", Hello.class);
        hello.print();

    }
}
