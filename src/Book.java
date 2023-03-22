public class Book {
    private String title;
    private int num_pages;
    private double price;
    private int quantity;

    public Book(String thetitle, int pages, double cost, int num) {
        title = thetitle;
        num_pages = pages;
        price = cost;
        quantity = num;
    }

    public double sell(int num) {
        if (num <= 0 || num > quantity) {
            return 0;
        }
        quantity -= num;
        return num * price;
    }

    public String toString() {
        return "Title: " + title + "\nNumber of Pages: " + num_pages + "\nPrice: $" + price + "\nQuantity: " + quantity;
    }

    public Book cliff_notes() {
        if (num_pages <= 300) {
            return null;
        }
        String new_title = "cliff" + title;
        int new_pages = num_pages / 6;
        double new_price = price / 2;
        return new Book(new_title, new_pages, new_price, quantity);
    }

    public String get_title() {
        return title;
    }

    public void add_quantity(int change) {
        if (change > 0) {
            quantity += change;
        }
    }

    public int get_quantity() {
        return quantity;
    }

    public double get_price() {
        return price;
    }

}//end class Book
