package co.incubyte;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EmiControllerShould {
    EmiController emiController;
    EmiService emiService;

    @BeforeEach
    public void init(){
        this.emiService =Mockito.mock(EmiService.class);
        this.emiController=new EmiController(emiService);
    }
    @Test
    @DisplayName("call service")
    void call_service(){
        int loanAmount = 200000;
        double InterestRate = 3.5;
        int durationInYears = 30;

        emiController.getEmi(loanAmount,InterestRate,durationInYears);
        Mockito.verify(emiService).getEmi(loanAmount,InterestRate,durationInYears);
    }
}
