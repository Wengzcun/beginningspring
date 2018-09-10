package sample.spring4.ch1.bankapp.service;

import sample.spring4.ch1.bankapp.dao.FixedDepositDao;
import sample.spring4.ch1.bankapp.model.FixedDepositDetails;

/**
 * Created by Rene on 2018. 9. 10..
 */
public class FixedDepositService {

    private FixedDepositDao fixedDapositDao;

    public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
        return true;
    }

    public void setFixedDapositDao(FixedDepositDao fixedDapositDao) {
        this.fixedDapositDao = fixedDapositDao;
    }

    public FixedDepositDao getFixedDapositDao() {
        return fixedDapositDao;
    }
}
