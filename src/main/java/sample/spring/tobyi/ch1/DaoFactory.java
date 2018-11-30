package sample.spring.tobyi.ch1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sample.spring.tobyi.ch1.dao.UserDao;

/**
 * Created by Rene on 2018. 9. 19..
 */
public class DaoFactory {

    public UserDao userDao() {
        return new UserDao();
    }

}
