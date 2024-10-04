public class PayPalService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processando pagamento de " + amount + " via PayPal.");
    }
}
