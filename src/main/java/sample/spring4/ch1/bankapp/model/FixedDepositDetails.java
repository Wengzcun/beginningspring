package sample.spring4.ch1.bankapp.model;

/**
 * Created by Rene on 2018. 9. 10..
 */
public class FixedDepositDetails {
    private int count;
    private int amount;
    private int term;
    private String email;

    public FixedDepositDetails() {
        this.count = 0;
        this.amount = 0;
        this.term = 0;
        this.email = "test@test.com";
    }

    public FixedDepositDetails(int count, int amount, int term, String email) {
        this.count = count;
        this.amount = amount;
        this.term = term;
        this.email = email;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
