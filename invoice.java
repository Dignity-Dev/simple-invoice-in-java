public class Invoice {
    // Instance variables
    private String partNumber;
    private String itemName;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String itemName, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.itemName = itemName;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Getters and Setters for instance variables
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    // Method to calculate the invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an Invoice object
        Invoice invoice = new Invoice("123456", "Hammer", "Claw Hammer", 2, 10.99);

        // Printing invoice details
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Item Name: " + invoice.getItemName());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}
