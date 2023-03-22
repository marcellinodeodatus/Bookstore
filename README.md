 3/22/2020
 ---------
Name: Deodatus Marcellino
-------------------------
Bookstore
---------
This program is a simulation of a simple bookstore written in Java. Written for an assignment in COP3330 class. 
There are three Java classes in this project: Book.java, Bookstore.java, and Main.java.

Book Class
----------
A Book object keeps track of information for one particular book title that could potentially be stored in a book store. Here are the instance variables for the class:

private String title;
private int num_pages;
private double price;
private int quantity;

Here are the instance methods in the Book class:

// Constructor: Takes in the title of the book, the number of pages in the book, the cost of the 
// the book and the quantity of books and initializes each of the appropriate instances variables
// in the object.
public Book(String thetitle, int pages, double cost, int num);

// This method executes selling num number of books. If num is negative, zero, or larger than the //  quantity stored in the book object, return 0. Otherwise, adjust the quantity instance variable of //  the object to indicate selling num books and return the total price of the books sold.
public double sell(int num);

// Returns all the information about a Book object in a String. (Make it readable!)
public String toString();

// If the Book Object this method is called on has more than 300 pages, this method will create a // new Book object. This new book object will have 1/6 the total number of pages, 1/2 the price 
// and the same quantity as the object upon which the method was called. Finally, the title of the 
// new book object will be the old title with "cliff" concatenated to the front of it. If the Book 
// object this method is called on has 300 pages or less, null should be returned.
public Book cliff_notes();

// Returns the title of the Book object the method is called on.
public String get_title();

// Adds change number of books to the Book object. If change is negative, nothing is done. 
public void add_quantity(int change);

// Returns the quantity of the Book object.
public int get_quantity();

// Returns the price of the Book object.
public double get_price();

Bookstore class
---------------
Here are the instance methods in the class:

// Constructor that creates a new, empty Bookstore object.
public Bookstore();

// Adds a new Book b to the stock of the Bookstore object.
public void add_new(Book b);

// Adds quantity number of books to the book already in stock in the Bookstore object with
// the title title. If the book is not in the Bookstore object, nothing is done.
public void add_quantity(String title, int quantity);

// Returns true if quantity or more copies of a book with the title title are contained in the 
// Bookstore object.
public boolean in_stock(String title, int quantity);

// Executes selling quantity number of books from the Bookstore object with the title title to the
// buyer. (Note: there is NO I/O done in this method, the Bookstore object is changed to reflect
// the sale. The method returns true is the sale was executed successfully, false otherwise.
public boolean sell(String title, int quantity);

// Lists all of the titles of the books in the Bookstore object, one per line, along with the quantity
// in stock.
public void list_titles();

// Returns the total gross income of the bookstore object.
public double get_income();

Main class
----------
Prompt the user with the following menu choices:

	1) Add a book to the stock
	2) Sell a book in stock
	3) List all the book titles in stock
	4) Print out the gross income of the store
	5) Quit

