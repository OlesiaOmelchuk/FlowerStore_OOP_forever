package ua.edu.ucu.apps.demo.flowerstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flowerstore.payments.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.flowerstore.payments.PayPalPaymentStrategy;

public class PaymentsTest {
    CreditCardPaymentStrategy card = new CreditCardPaymentStrategy();
    PayPalPaymentStrategy payPal = new PayPalPaymentStrategy();

    @Test
    void testCard(){
        Assertions.assertTrue(card.pay(100));
    }

    @Test
    void testPal(){
        Assertions.assertTrue(payPal.pay(100));
    }
}
