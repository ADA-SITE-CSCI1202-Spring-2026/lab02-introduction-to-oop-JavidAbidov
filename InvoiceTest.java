public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("A123", "Hammer", 5, 12.5);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: " + invoice.getInvoiceAmount());

        Invoice invoice2 = new Invoice("B456", "Drill", -3, -20);

        System.out.println("\nInvalid Test:");
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price per item: " + invoice2.getPricePerItem());
        System.out.println("Total Invoice Amount: " + invoice2.getInvoiceAmount());
    }
}
