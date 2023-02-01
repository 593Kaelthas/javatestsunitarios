package javatests.payments;

public class PaymentResponse {
    public enum PaymentStatus{
        OK,ERROR
    }

    //atributos
    private PaymentStatus status;
    public PaymentResponse (PaymentStatus status){
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
