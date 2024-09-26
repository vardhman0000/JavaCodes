package OOPs;

public class Books {

    static class Book{
        private String title;
        private String author;
        private double price;

        Book(String title, String author, double price){
            this.title = title;
            this.author = author;
            this.price = price ;
        }

        public String getTitle(){
            return title;
        }
        public String getAuthor(){
            return author;
        }
        public double getPrice(){
            return price;
        }

        public void setTitle(String title){
            this.title = title;
        }
        public void setAuthor(String author){
            this.author = author;
        }
        public void setPrice(double price){
            this.price = price;
        }

        public void showBook() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }

    }

    public static void main(String[] args) {
        Book b1 = new Book("ABC", "DEF", 99);
        b1.showBook();
    }

}
