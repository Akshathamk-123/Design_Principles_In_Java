// PaymentService interface
interface PaymentService {
    void processPayment(double amount);
}
// CreditCardPaymentService class
class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// PayPalPaymentService class
class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
// OrderProcessor class
class OrderProcessor {
    private PaymentService paymentService;

    // Constructor Injection
    public OrderProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processOrder(double amount) {
        // Process order logic
        System.out.println("Processing order...");
        paymentService.processPayment(amount);
    }
}
// Main class to test the implementation
public class low_coupling {
    public static void main(String[] args) {
        // Using CreditCardPaymentService
        PaymentService creditCardPaymentService = new CreditCardPaymentService();
        OrderProcessor orderProcessor1 = new OrderProcessor(creditCardPaymentService);
        orderProcessor1.processOrder(100.0);

        // Using PayPalPaymentService
        PaymentService payPalPaymentService = new PayPalPaymentService();
        OrderProcessor orderProcessor2 = new OrderProcessor(payPalPaymentService);
        orderProcessor2.processOrder(200.0);
    }
}
