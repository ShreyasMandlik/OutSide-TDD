package co.incubyte;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Emi {
    private int interestPaid;


    public Emi(@JsonProperty("total_interest_paid") int interestPaid) {
        this.interestPaid = interestPaid;
    }

    public int getInterestPaid() {
        return  interestPaid;
    }
}
