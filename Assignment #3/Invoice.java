//Anthony Bravo

public class Invoice implements  Payable{

    private String invoiceNumber;
    private String invoiceType;
    private int quantity;
    private double pricePerItem;

    //Constructor
    public Invoice(String invoiceNumber, String invoiceType, int quantity, double pricePerItem) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceType = invoiceType;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    //Setter methods
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem >= 0) {
            this.pricePerItem = pricePerItem;
        }
        else {
            throw new IllegalArgumentException("Price per item must not be negative");
        }
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
        }
        else {
            throw new IllegalArgumentException("Quantity must not be negative");
        }
    }

    //Getter methods
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    //Override Methods

    @Override
    public double getPaymentAmount() {
        return ( getQuantity()*getPricePerItem() );
    }

    @Override
    public String toString() {
        return String.format("%s: %s \n%s: %s \n%s: %d \n%s: $%,.2f",
                "Invoice Number",getInvoiceNumber(), "Invoice Type", getInvoiceType(),
                "quantity", getQuantity(), "price per item", getPricePerItem() );
    }
}
