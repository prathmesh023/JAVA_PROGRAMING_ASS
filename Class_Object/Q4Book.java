// Q4. Book Class Example

class Book {
    String title;
    String author;
    int price;

    public static void main(String[] args) {

        Book b = new Book();

        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 499;

        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Price: " + b.price);
    }
}

/*
Expected Output:
Title: Java Programming
Author: James Gosling
Price: 499
*/
