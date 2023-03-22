import java.util.ArrayList;

public class Bookstore {
    private ArrayList<Book> inventory;
    private double income;

    public Bookstore() {
        inventory = new ArrayList<Book>();
        income = 0;
    }

    public void add_new(Book b) {
        inventory.add(b);
    }

    public void add_quantity(String title, int quantity) {
        for (Book b : inventory) {
            if (b.get_title().equals(title)) {
                b.add_quantity(quantity);
            }
        }
    }

    public boolean in_stock(String title, int quantity) {
        for (Book b : inventory) {
            if (b.get_title().equals(title) && b.get_quantity() >= quantity) {
                return true;
            }
        }
        return false;
    }

    public boolean sell(String title, int quantity) {
        for (Book b : inventory) {
            if (b.get_title().equals(title) && b.get_quantity() >= quantity) {
                double revenue = b.sell(quantity);
                income += revenue;
                return true;
            }
        }
        return false;
    }

    public void list_titles() {
        for (Book b : inventory) {
            System.out.println(b.get_title() + " - Quantity: " + b.get_quantity());
        }
    }

    public double get_income() {
        return income;
    }
}
