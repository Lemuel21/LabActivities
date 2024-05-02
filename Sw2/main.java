public class main{
public static void main(String[] args) {
        Customer student = new Customer("Lemmei", CustomerType.STUDENT, 250.00);
        Customer senior = new Customer("Lester", CustomerType.SENIOR_CITIZEN, 300.00);
        Customer regular = new Customer("Chyai", CustomerType.REGULAR, 200.00);
    
        System.out.println("Student Discounted price is " + student.applyDiscount(student.getAmount()));
        System.out.println("Senior Discounted price is " + senior.applyDiscount(senior.getAmount()));
        System.out.println("Regular Discounted price is " + regular.applyDiscount(regular.getAmount()));
    }

}