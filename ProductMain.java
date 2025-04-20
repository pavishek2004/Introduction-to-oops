package OopsConcept;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];
        
        // a. Accept five product information from user and store in an array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            
            System.out.print("Enter Product ID: ");
            int pid = scanner.nextInt();
            
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            
            products[i] = new Product(pid, price, quantity);
        }
        
        // b. Find Pid of the product with the highest price
        int highestPricePid = findHighestPriceProductId(products);
        System.out.println("Product ID with highest price: " + highestPricePid);
        
        // c. Calculate and display total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: $" + totalAmount);
        
        scanner.close();
    }
    
    // Method to find product ID with highest price
    private static int findHighestPriceProductId(Product[] products) {
        double maxPrice = 0;
        int maxPricePid = 0;
        
        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                maxPricePid = product.getPid();
            }
        }
        
        return maxPricePid;
    }
    
    // c. Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        
        for (Product product : products) {
            // Amount spent on single product = price of product * quantity of product
            totalAmount += product.getPrice() * product.getQuantity();
        }
        
        return totalAmount;
    }
}