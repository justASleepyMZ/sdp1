interface Product {
    double getDiscount();
}

class FoodProduct implements Product {
    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return this.price * 0.1; // 10% discount for food products
    }
}

class ElectronicsProduct implements Product {
    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return this.price * 0.05; // 5% discount for electronics
    }
}

class ClothingProduct implements Product {
    public double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return this.price * 0.15; // 15% discount for clothing products
    }
}

class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        Product food = new FoodProduct(100);
        Product electronics = new ElectronicsProduct(200);
        Product clothing = new ClothingProduct(150);

        System.out.println("Food Product Discount: " + calculator.calculateDiscount(food)); // 10.0
        System.out.println("Electronics Product Discount: " + calculator.calculateDiscount(electronics)); // 10.0
        System.out.println("Clothing Product Discount: " + calculator.calculateDiscount(clothing)); // 22.5
    }
}
