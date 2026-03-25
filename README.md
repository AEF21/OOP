![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# OOP 1 – Exercises

## Exercise 1
- Create a `BankAccount` class.
- Fields: `accountHolder`, `balance`.
- Apply **encapsulation** by making fields private.
- Use:
    - Constructors to initialize values
    - Getters to read data
    - Setters to update data safely
    - Use deposit and withdraw methods to update the balance
- Create **multiple BankAccount objects** with different values.
- Show how each object maintains its own data.
- Create a UML class diagram.
---

## Exercise 2
- Create a `Customer` class.
- Add the required fields (e.g., customerId, name, email).
- Apply **encapsulation** by making all fields private.
- Use:
    - Constructors to initialize customer data
    - Getters to access field values
    - Setters to update field values safely
- Create **multiple Customer objects** with different data.
- Demonstrate that each object stores and manages its own information.
- Create a UML class diagram for the `Customer` class.
---

## Exercise 3
- Create a `Student` class.
- Add the required fields (e.g., studentId, name, age, major).
- Apply **encapsulation** by making all fields private.
- Use:
    - Constructors to initialize student data
    - Getters to access field values
    - Setters to update field values safely
- Create **multiple Student objects** with different data.
- Show that each object represents a unique student.
- Create a UML class diagram for the `Student` class.
---

## Exercise 4
- Create a `Product` class.
- Add the required fields (e.g., productId, name, price).
- Apply **encapsulation** by making all fields private.
- Use:
    - **Constructors** to initialize product data
    - Getters to read product information
    - Setters to update product details safely
- Create **multiple Product objects** with different values.
- Demonstrate that each object maintains its own state.
- Create a UML class diagram for the `Product` class.
---

## Exercise 5 (Optional)
- Create a class **Order**
- An order contains **multiple products** (use a collection)
- Apply **encapsulation**:
  - All fields must be **private**
- Use:
  - Constructors
  - Getters to access order data
- Add methods:
  - `addProduct(Product p)`
  - `removeProduct(Product p)`
  - `calculateTotal()` to compute the total price
- Create **multiple orders**, each with different product lists
- Each order should calculate its **own total price**

### Relationship
- One **Order** → many **Products**
---
[OOP2_Exercises.md](../../../Users/deltagare/Downloads/OOP2_Exercises.md)
![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# OOP Practice Exercises — Inheritance, Polymorphism & Abstraction

These exercises are based on the **Tire Service Booking** domain and are designed
to help you practice **core OOP concepts** step by step.

---

## Exercise 1

### Goal

Practice **inheritance** by modeling different tire-change services.

---

1. Create an **abstract class** `Service` with common properties:
  - `id`
  - `name`
  - `basePrice`

2. Create the following subclasses:
  - `WinterTireChange`
  - `SummerTireChange`

3. Each subclass may:
  - Define its own service duration
  - Adjust pricing rules if needed

---

### Requirements

- `Service` must be abstract
- Subclasses must extend `Service`
- Use proper encapsulation (private fields, getters)

---

## Exercise 2

### Goal

Practice **polymorphism** using method overriding.

---

### Task

1. Add the following abstract method to `Service`:
   ```java
   public abstract int calculatePrice();
   ```

2. Override `calculatePrice()` in each subclass:
  - `WinterTireChange` may include a storage fee
  - `SummerTireChange` may include a seasonal discount

3. Store service objects as:
   ```java
   List<Service> services;
   ```

4. Call `calculatePrice()` on each service and observe different behavior.

---

### Requirements

- Method must be overridden in subclasses
- Use a `Service` reference when calling the method
- Do not use `instanceof`

---

## Exercise 3

### Goal

Practice **abstraction using interfaces**.

---

### Task

1. Create an interface called `BookingProcessor`:

    ```java
    public interface BookingProcessor {
        Booking processBooking(BookingRequest request);
    }
    ```

   This interface defines **what** a booking processor must do,
   but not **how** the booking rules are applied.

2. Create two implementations:

  - `MemberBookingProcessor`
  - `NonMemberBookingProcessor`

   Each implementation should:

  - Apply different business rules
  - For example:
    - Members receive a discount
    - Members may get priority access to time slots
    - Non-members pay the full price

3. Use the interface type when processing bookings:

   ```java
   BookingProcessor processor = new MemberBookingProcessor();
   ```

   Later, you should be able to switch to:

   ```java
   BookingProcessor processor = new NonMemberBookingProcessor();
   ```

   without changing any other code.
   
   
