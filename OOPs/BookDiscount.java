package OOPs;

public class BookDiscount {

    static class BookCD{
        String title;
        String author;
        float price;
        String type;

        BookCD(String title, String author, float price, String type){
            this.title = title;
            this.author = author;
            this.price = price;
            this.type = type;
        }

        void displayDetails(){
            System.out.println("Title : " + title);
            System.out.println("Author : " + author);
            System.out.println("Price : " + price);
            System.out.println("Type : " + type);
        }

        float applyDiscount(float discount){
            if(discount >= 0 && discount <= 100) {
                return price - (price * (discount / 100));
            }
            return 0f;
        }
    }

    public static void main(String[] args) {
        BookCD book = new BookCD("ABC", "DEF", 250.25f, "book");
        book.displayDetails();
        float updatedPrice = book.applyDiscount(10.00f);
        System.out.println("Price after Discount : " + updatedPrice);
    }


}
