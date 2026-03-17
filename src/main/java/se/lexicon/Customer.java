package se.lexicon;
//Create a `Customer` class.
public class Customer {

    //Add the required fields (e.g., customerId, name, email).
    private String customerID;
    private String name;
    private String email;


    //Apply **encapsulation** by making all fields private

    //Constructors to initialize customer data
    public Customer(String customerID, String name, String email){
        this.customerID = customerID;
        this.name = name;
        this.email = email;

    }
    //Setters to update field values safely

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //Getters to access field values

    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }





    //- Demonstrate that each object stores and manages its own information.

    //Create a UML class diagram for the `Customer` class


























}
