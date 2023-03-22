import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bookstore store = new Bookstore();
        Scanner input = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("\n\nWelcome to the Bookstore!");
            System.out.println("Please select an option from the menu:");
            System.out.println("1) Add a book to the stock");
            System.out.println("2) Sell a book in stock");
            System.out.println("3) List all the book titles in stock");
            System.out.println("4) Print out the gross income of the store");
            System.out.println("5) Quit");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the title of the book you want to add:");
                    input.nextLine();
                    String title = input.nextLine();

                    if (store.in_stock(title, 1)) {
                        System.out.println("The book " + title + " is already in stock. How many more would you like to add?");
                        int quantity = input.nextInt();
                        store.add_quantity(title, quantity);
                    } else {
                        System.out.println("Enter the number of pages in the book:");
                        int pages = input.nextInt();
                        System.out.println("Enter the price of the book:");
                        double price = input.nextDouble();
                        System.out.println("Enter the quantity of the book:");
                        int quantity = input.nextInt();

                        Book b = new Book(title, pages, price, quantity);
                        store.add_new(b);
                        System.out.println("The book " + title + " has been added to the stock.");
                    }
                    break;

                case 2:
                    System.out.println("Enter the title of the book you want to sell:");
                    input.nextLine();
                    title = input.nextLine();

                    if (!store.in_stock(title, 1)) {
                        System.out.println("Sorry, the book " + title + " is not in stock.");
                    } else {
                        System.out.println("Enter the quantity of the book you want to sell:");
                        int quantity = input.nextInt();

                        if (store.sell(title, quantity)) {
                            System.out.println("The transaction was completed successfully.");
                        } else {
                            System.out.println("Sorry, there are not enough copies of the book " + title + " in stock to complete the transaction.");
                        }
                    }
                    break;

                case 3:
                    store.list_titles();
                    break;

                case 4:
                    System.out.println("The gross income of the store is: $" + store.get_income());
                    break;

                case 5:
                    System.out.println("Thank you for using the Bookstore! Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }

        } while (choice != 5);

        input.close();
    }
}
