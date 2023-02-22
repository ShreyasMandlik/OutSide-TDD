package co.incubyte;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@MicronautTest

public class EmiCalculatorTest {

    @Client("/")
    @Inject
    HttpClient httpClient;

    @Test
    @DisplayName("Emi to be calculated")
    void emi_to_be_calculated() {

        int loanAmount = 200000;
        double InterestRate = 3.5;
        int durationInYears = 30;

        Emi emi = httpClient.toBlocking().retrieve(
                "https://mocki.io/v1/df83f023-0955-4b1c-9654-54b9968f999c", Emi
                        .class
        );
        int interestPaid=emi.getInterestPaid();

        Assertions.assertThat(interestPaid).isEqualTo(123312);

    }

}
