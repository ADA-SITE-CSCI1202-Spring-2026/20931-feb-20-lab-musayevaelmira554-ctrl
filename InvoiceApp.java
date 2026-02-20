import java.util.Scanner;

class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public String toString() {
        return "Part Number: " + partNumber +
               ", Description: " + partDescription +
               ", Quantity: " + quantity +
               ", Price per item: " + pricePerItem +
               ", Invoice Amount: " + getInvoiceAmount();
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part Number: ");
            String partNumber = scanner.nextLine();

            System.out.print("Part Description: ");
            String partDescription = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per item: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            invoices[i] = new Invoice(partNumber, partDescription, quantity, price);
        }

        System.out.println("\n--- Invoice Results ---");

        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }

        scanner.close();
    }
}
