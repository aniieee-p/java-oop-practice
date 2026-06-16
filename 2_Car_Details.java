// Define a class to represent a Car
class Car {
    // Field: stores the brand name of the car (String type)
    String brand;
    // Field: stores the price of the car (int type)
    int price;

    // Method: displays car details
    void showDetails() {
        // Print the car brand using string concatenation
        System.out.println("Brand: " + brand);
        // Print the car price using string concatenation
        System.out.println("Price: " + price);
    }
}

// Public class that contains the main method (entry point of the program)
class Main {
    // Main method: starting point of Java program (executed first)
    public static void main(String[] args) {
        // Create an object of Car class and assign it to variable 'c'
        Car c = new Car();

        // Assign the value "Honda" to the 'brand' field of object 'c'
        c.brand = "Honda";
        // Assign the value 1200000 to the 'price' field of object 'c'
        c.price = 1200000;

        // Call the showDetails() method of object 'c' to print car information
        c.showDetails();
    }
}