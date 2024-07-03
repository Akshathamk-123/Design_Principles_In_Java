
// PaymentMethod interface
interface PaymentMethod {
    void pay(double amount);
}
// CreditCardPayment class
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card with card number " + cardNumber);
    }
}

// PayPalPayment class
class PayPalPayment implements PaymentMethod {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal with email " + email);
    }
}
// Customer class
class Customer {
    private String name;
    private PaymentMethod paymentMethod;

    public Customer(String name, PaymentMethod paymentMethod) {
        this.name = name;
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double amount) {
        System.out.println(name + " is making a payment.");
        paymentMethod.pay(amount);
    }

    // Setter for payment method to demonstrate flexibility
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
// Main class to test the implementation
public class protected_variation {
    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        PaymentMethod payPalPayment = new PayPalPayment("user@example.com");

        Customer customer = new Customer("Alice", creditCardPayment);
        customer.makePayment(100.0);

        // Change the payment method
        customer.setPaymentMethod(payPalPayment);
        customer.makePayment(200.0);
    }
}

