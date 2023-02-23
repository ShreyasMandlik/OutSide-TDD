package co.incubyte;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EmiServiceShould {
    EmiService emiService;
    EmiClient emiClient;

    @BeforeEach
    public void init(){
        this.emiClient=Mockito.mock(EmiClient.class);
        this.emiService=new EmiService(emiClient);
    }

    @Test
    @DisplayName("Emi client called")
    void emi_client_called(){

        int loanAmount = 200000;
        double InterestRate = 3.5;
        int durationInYears = 30;

        emiService.getEmi(loanAmount,InterestRate,durationInYears);
        Mockito.verify(emiClient).fetch(loanAmount,InterestRate,durationInYears);

    }

}
