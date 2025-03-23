package P2; 

public class Main {
    public static void main(String[] args) {
        Customer student = new Customer("Alice", new StudentDiscount());
        Customer senior = new Customer("Bob", new SeniorCitizenDiscount());
        Customer regular = new Customer("Charlie", new NoDiscount());

        double amount = 100;

        System.out.println(student.getName() + " pays: $" + student.applyDiscount(amount));
        System.out.println(senior.getName() + " pays: $" + senior.applyDiscount(amount));
        System.out.println(regular.getName() + " pays: $" + regular.applyDiscount(amount));
    }
}