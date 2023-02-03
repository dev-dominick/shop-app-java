package duke.choice;

public class Clothing implements Comparable<Clothing>{
    private String description;
    private double price;
    private String size = "M";
    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = 0.2;

    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * getMIN_TAX());
    }

    public void setPrice(double price) {

        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getMIN_PRICE() {
        return MIN_PRICE;
    }

    public double getMIN_TAX() {
        return TAX_RATE;
    }


    //look this up
    @Override
    public String toString() {
        return getDescription() + ", " + getSize() + ", " + getPrice();

    }

    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }
}
