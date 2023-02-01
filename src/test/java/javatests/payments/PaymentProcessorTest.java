package javatests.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    @Test
    public void payment_is_correct() {
        //dado q es una interfaz, pues la simulo
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        //x q espero que mi pago salga bien?. Lo simulo con Mockito
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        boolean result = paymentProcessor.makePayment(1000);
        assertEquals(true,result);
    }

    @Test
    public void payment_is_incorrect() {
        //dado q es una interfaz, pues la simulo
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        //x q espero que mi pago salga bien?. Lo simulo con Mockito
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        boolean result = paymentProcessor.makePayment(1000);
        assertEquals(false,result);
    }
}