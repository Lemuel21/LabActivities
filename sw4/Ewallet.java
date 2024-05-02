package sw4;

public class Ewallet implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("You are paying using GCash");
    }
}
