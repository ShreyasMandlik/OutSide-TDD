package co.incubyte;

public class EmiService {
    private final EmiClient emiClient;

    public EmiService(EmiClient emiClient) {
            this.emiClient=emiClient;
    }

    public void getEmi(int loanAmount, double interestRate, int durationInYears) {
        emiClient.fetch(loanAmount,interestRate,durationInYears);
    }
}
