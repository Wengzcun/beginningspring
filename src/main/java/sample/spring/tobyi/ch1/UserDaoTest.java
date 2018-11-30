package sample.spring.tobyi.ch1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.spring.tobyi.ch1.dao.UserDao;

/**
 * Created by Rene on 2018. 9. 19..
 */
public class UserDaoTest {

    public static void main(String[] args) {
        DaoFactory factory = new DaoFactory();
        UserDao dao1 = factory.userDao();
        UserDao dao2 = factory.userDao();

        //ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/tobyispringApplicationContext.xml");
        UserDao dao3 = context.getBean("userDao", UserDao.class);
        UserDao dao4 = context.getBean("userDao", UserDao.class);

        System.out.println("dao1 :: " + dao1);
        System.out.println("dao2 :: " + dao2);
        System.out.println("dao3 :: " + dao3);
        System.out.println("dao4 :: " + dao4);

        System.out.println("dao1 == dao2 :: " + (dao1 == dao2));
        System.out.println(dao3 == dao4);

        System.out.println(dao1.equals(dao2));
        System.out.println(dao3.equals(dao4));

    }
}
