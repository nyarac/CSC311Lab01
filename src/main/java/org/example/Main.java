package org.example;

public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "Number of wheels: " + numberOfWheels + ", Engine Size :" + engineSize + ", Color :"
                + color + ", fuelType :" + fuelType;
    }


    public class Car extends Vehicle {
        private String brand;

        public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
            super(numberOfWheels, color, engineSize, fuelType);
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public static void Honk() {
            System.out.print("Honk, honk!");
        }

        @Override
        public String toString() {
            return "Brand: " + brand + super.toString();

        }
    }
}


