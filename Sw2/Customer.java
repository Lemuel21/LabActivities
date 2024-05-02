public class Customer {
    private String name;
    private Discount discount;
    private double amount;
  
    public Customer(String name, CustomerType type, double amount) {
        this.name = name;
        this.amount = amount;
        setDiscount(type);
    }

    public double getAmount(){
        return amount;
    }

    private void setDiscount(CustomerType type) {
        switch (type) {
            case STUDENT:
                discount = new StudentDiscount();
                break;
            case SENIOR_CITIZEN:
                discount = new SeniorCitizenDiscount();
                break;
            default:
                discount = new RegularDiscount();
                break;
        }
    }

    public double calculateDiscount(double amount) {
        return discount.calculateDiscount(amount);
    }

    public double applyDiscount(double amount) {
        return amount - calculateDiscount(amount);
    }
}

enum CustomerType {
    STUDENT,
    SENIOR_CITIZEN,
    REGULAR
}
