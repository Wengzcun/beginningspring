package sample.spring4.ch1.bankapp.controller;

import org.apache.log4j.Logger;
import sample.spring4.ch1.bankapp.domain.model.FixedDepositDetails;
import sample.spring4.ch1.bankapp.service.FixedDepositService;


/**
 * Created by Rene on 2018. 9. 10..
 */
public class FixedDepositController {
    private Logger logger = Logger.getLogger(FixedDepositController.class.getName());
    private FixedDepositService fixedDepositService;

    public void setFixedDepositService(FixedDepositService fixedDepositService) {
        logger.info("Setting fixedDepositService porperty");
        this.fixedDepositService = fixedDepositService;
    }

    public boolean submit() {
        return fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 10000, 365, "centauros@gmail.com"));
    }
}
