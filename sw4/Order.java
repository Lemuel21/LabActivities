package sw4;

    public class Order {
        private String orderId;
        private double amount;
        private String paymentMethod;
    
        public Order(String orderId, double amount, String paymentMethod) {
            this.orderId = orderId;
            this.amount = amount;
            this.paymentMethod = paymentMethod;
        }
    
        public String getOrderId() {
            return orderId;
        }
    
        public double getAmount() {
            return amount;
        }
    
        public String getPaymentMethod() {
            return paymentMethod;
        }
    }
    

