public class CheckoutService {
    private PaymentService paymentService;

    // Construtor onde a dependência é injetada
    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void checkout(double amount) {
        System.out.println("Iniciando checkout para o valor de: " + amount);
        paymentService.processPayment(amount);
    }
}
