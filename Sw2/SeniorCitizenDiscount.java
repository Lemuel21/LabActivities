public class SeniorCitizenDiscount implements Discount{
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}