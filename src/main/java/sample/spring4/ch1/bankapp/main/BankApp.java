package sample.spring4.ch1.bankapp.main;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.spring4.ch1.bankapp.controller.FixedDepositController;

/**
 * Created by Rene on 2018. 9. 11..
 */
public class BankApp {

    private static Logger logger = Logger.getLogger(BankApp.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:META-INF/spring4ApplicationContext.xml");

        FixedDepositController fixedDepositController = (FixedDepositController) context.getBean("controller");
        logger.info("Submission status of fixed deposit : " + fixedDepositController.submit());
        //logger.info("Return fixed deposit info : " + fixedDepositController.get());

    }


}
