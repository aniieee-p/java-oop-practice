// Best Approach: Using Constructor, Encapsulation, and toString() method
class Car {
    // Private fields: restrict direct access (Encapsulation principle)
    private String brand;
    private int price;

    // Constructor: initializes the Car object with parameters
    // This ensures the object is created in a valid state
    public Car(String brand, int price) {
        this.brand = brand;    // Assign parameter value to instance variable 'brand'
        this.price = price;    // Assign parameter value to instance variable 'price'
    }

    // Getter method for 'brand': allows controlled read access to the private field
    public String getBrand() {
        return brand;
    }

    // Setter method for 'brand': allows controlled write access to the private field
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter method for 'price': allows controlled read access to the private field
    public int getPrice() {
        return price;
    }

    // Setter method for 'price': allows controlled write access to the private field
    public void setPrice(int price) {
        this.price = price;
    }

    // Override toString() method: returns a string representation of the object
    // This method is automatically called when printing the object
    @Override
    public String toString() {
        return "Brand: " + brand + "\nPrice: " + price;
    }
}

// Public class that contains the main method
public class Main {
    // Main method: starting point of Java program
    public static void main(String[] args) {
        // Create a Car object using the constructor with parameters
        // This is better than creating empty object and assigning values later
        Car c = new Car("Honda", 1200000);

        // Print the object directly using toString() method
        // No need to call a separate showDetails() method
        System.out.println(c);

        // You can also use getters to access individual fields
        System.out.println("\nAccessing via getters:");
        System.out.println("Brand: " + c.getBrand());
        System.out.println("Price: " + c.getPrice());

        // You can also use setters to modify the values
        c.setBrand("Toyota");
        c.setPrice(1500000);
        System.out.println("\nAfter modification:");
        System.out.println(c);
    }
}
