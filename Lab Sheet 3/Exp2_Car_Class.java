class Car {
    String brand;
    String model;

    public Car() {
        brand = "Unknown";
        model = "Unknown";
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();

        Car c2 = new Car("Toyota", "Fortuner");
        c2.display();
    }
}