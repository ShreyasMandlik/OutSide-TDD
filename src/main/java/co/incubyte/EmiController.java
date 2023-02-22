package co.incubyte;

public class EmiController {

    EmiService emiService;
    public EmiController(EmiService emiService) {
        this.emiService=emiService;
    }

    public void getEmi(int loanAmount, double interestRate, int durationInYears) {
        this.emiService.getEmi(loanAmount,interestRate,durationInYears);
    }
}
