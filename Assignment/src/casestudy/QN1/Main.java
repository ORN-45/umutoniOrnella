package casestudy.QN1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== REAL CONSTRUCTOR: Site Construction Management System =====");


        String contractorId = "";
        while (true) {
            System.out.print("Enter Contractor ID: ");
            contractorId = scanner.nextLine().trim();
            if (contractorId.matches("\\d+")) {
                break;
            } else {
                System.out.println("Error: The ID must contain only numbers. Please try again.");
            }
        }


        String contractorName = "";
        while (true) {
            System.out.print("Enter Contractor Name: ");
            contractorName = scanner.nextLine().trim();
            if (contractorName.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Error: Contractor's name must contain only letters. Try again.");
            }
        }


        double initialBalance = 0.0;
        while (true) {
            try {
                System.out.print("Enter material quantity to deliver (1-10 tons): ");
                initialBalance = Double.parseDouble(scanner.nextLine());
                if (initialBalance >= 1 && initialBalance <= 10) {
                    break;
                } else {
                    System.out.println("Error: Quantity must be between 1 and 10 tons. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }

        double quantity = 0;


        int choice;
        do {
            System.out.println("\n=== Site Construction System Menu ===");
            System.out.println("1. Material Delivery");
            System.out.println("2. Material Usage");
            System.out.println("3. Cost Estimation");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid choice. Enter a number between 1 and 4.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice >= 1 && choice <= 3) {
                while (true) {
                    try {
                        System.out.print("Enter the material quantity: ");
                        quantity = Double.parseDouble(scanner.nextLine());
                        if (quantity > 0) break;
                        else System.out.println("Error: Quantity must be greater than 0.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }
            }

            switch (choice) {
                case 1:
                    MaterialDelivery delivery = new MaterialDelivery(contractorId, contractorName, quantity, initialBalance);
                    delivery.receiveMaterial();
                    initialBalance = delivery.getMaterialBalance();
                    break;

                case 2:
                    MaterialUsage usage = new MaterialUsage(contractorId, contractorName, quantity, initialBalance);
                    usage.useMaterial();
                    initialBalance = usage.getMaterialBalance();
                    break;

                case 3:
                    CostEstimation estimation = new CostEstimation(contractorId, contractorName, quantity, initialBalance);
                    estimation.estimateCost();
                    break;

                case 4:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1 and 4.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
