package Task1_2;

public class Main1 {
    public static void main(String[] args) {
        Car myCar = new Car(5);

        System.out.println("Number of seats: " + myCar.getNumberOfSeats());

        myCar.start();
        myCar.stop();
    }
}
