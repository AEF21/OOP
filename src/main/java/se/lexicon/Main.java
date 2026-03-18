package se.lexicon;

public class Main {

    public static void main(String[] args) {

        // --- BankAccount objects ---
        BankAccount account1 = new BankAccount("10", "Pappa", 1500.00);
        BankAccount savingsAccount = new BankAccount("11", "Mamma", 8200.50);
        BankAccount salaryAccount = new BankAccount("14", "Kids", 32000.00);

        System.out.println("Bank Accounts:");
        System.out.println(account1.getOwnerName() + " - " + account1.getBalance());
        System.out.println(savingsAccount.getOwnerName() + " - " + savingsAccount.getBalance());
        System.out.println(salaryAccount.getOwnerName() + " - " + salaryAccount.getBalance());
        System.out.println();


        // --- Customer objects ---
        Customer payment1 = new Customer("1", "Ella", "ella@email.com");
        Customer payment2 = new Customer("2", "Bella", "bella@email.com");
        Customer payment3 = new Customer("3", "Milla", "milla@email.com");

        System.out.println("Customers:");
        System.out.println(payment1.getCustomerID() + " - " + payment1.getEmail());
        System.out.println(payment2.getCustomerID() + " - " + payment2.getEmail());
        System.out.println(payment3.getCustomerID() + " - " + payment3.getEmail());
        System.out.println();


        // --- Product objects ---
        Product filter1 = new Product("E58", "Light", 30);
        Product filter2 = new Product("E55", "Cold", 30);
        Product filter3 = new Product("E62", "Warm", 30);

        System.out.println("Products:");
        System.out.println(filter1.getProductId() + " : " + filter1.getPrice());
        System.out.println(filter2.getProductId() + " : " + filter2.getPrice());
        System.out.println(filter3.getProductId() + " : " + filter3.getPrice());
        System.out.println();


        // --- Student objects ---
        Student st1 = new Student("S001", "Alice", 21, "Computer Science");
        Student st2 = new Student("S002", "Bob", 23, "Mathematics");
        Student st3 = new Student("S003", "Charlie", 20, "Physics");


        System.out.println("Students:");
        System.out.println(st1.getStudentId() + " - " + st1.getName());
        System.out.println(st2.getStudentId() + " - " + st2.getName());
        System.out.println(st3.getStudentId() + " - " + st3.getName());
        System.out.println();


        // --- Order with multiple products ---
        Product p1 = new Product("P001", "Laptop", 12000);
        Product p2 = new Product("P002", "Mouse", 250);
        Product p3 = new Product("P003", "Keyboard", 600);

        Order order = new Order("O1001");
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        System.out.println("Order:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Total price: " + order.calculateTotal());
    }
}
