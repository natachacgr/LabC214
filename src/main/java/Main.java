public class Main {
    public static void main(String[] args) {
        PaymentService creditCardService = new CreditCardService();
        CheckoutService checkout = new CheckoutService(creditCardService);
        checkout.checkout(100.00);

        PaymentService payPalService = new PayPalService();
        checkout = new CheckoutService(payPalService);
        checkout.checkout(200.00);
    }
}
