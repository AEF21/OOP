package se.lexicon;

public class Main {


    //Create **multiple BankAccount objects** with different values.
    public static void main(String[] args) {

        //Create **multiple BankAccount objects** with different values.

        BankAccount account1 = new BankAccount("10", "Pappa", 1500.00);
        BankAccount savingsAccount = new BankAccount("11", "Mamma", 8200.50);
        BankAccount salaryAccount = new BankAccount("14", "Kids", 32000.00);

        System.out.println(account1.getOwnerName() + " - " + account1.getBalance());
        System.out.println(savingsAccount.getOwnerName() + " - " + savingsAccount.getBalance());
        System.out.println(salaryAccount.getOwnerName() + " - " + salaryAccount.getBalance());






        //Create **multiple Customer objects** with different data.
        Customer payment1 = new Customer("1:", "ELLA", "ella@email.com");
        Customer payment2 = new Customer("2:", "Bella", "bella@email.com");
        Customer payment3 = new Customer("3:", "Milla", "milla@email.com");
        System.out.println(payment1.getCustomerID() + "" + payment1.getEmail());
        System.out.println(payment2.getCustomerID() + "" + payment2.getEmail());
        System.out.println(payment3.getCustomerID() + "" + payment3.getEmail());










            //Create **multiple Product objects** with different values.
            Product filter1 = new Product("E58","light",30);
            Product filter2 = new Product("E55", "could",30 );
            Product filter3 = new Product("E62", "Warm", 30);
            System.out.println(filter1.getProductId() + ":" + filter1.getPrice());
            System.out.println(filter2.getProductId() + ":" + filter2.getPrice());
            System.out.println(filter3.getProductId() + ":" + filter3.getPrice());


            // Create multiple Student objects with different data
            Student st1 = new Student("S001", "Alice", 21, 101);
            Student st2 = new Student("S002", "Bob", 23, 102);
            Student st3 = new Student("S003", "Charlie", 20, 103);

            // Show that each object is unique
            System.out.println(st1.getStudentId() + " - " + st1.getName());
            System.out.println(st2.getStudentId() + " - " + st2.getName());
            System.out.println(st3.getStudentId() + " - " + st3.getName());
        }
    }


