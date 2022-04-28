public class Main {
    public static void main(String[] args) {

        int ticketPrice = 2123450;
        int milePrice = 20;

        if (ticketPrice >= 20) {
            int miles = ticketPrice / milePrice;
            System.out.println("Вам начислены мили за покупку билета: " + miles);

        } else {
            System.out.println("Вам начислены мили за покупку билета: 0");
        }
    }
}