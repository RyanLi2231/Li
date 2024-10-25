public class Apple {
    public static void main(String[] args) {
        System.out.println("Apple");
        System.out.println("Banana");
        System.out.println("Burger");
        int number = 1;
        int number2 = 0;
        while (number < 6) {
            System.out.println("Apple " + number);
            number++;
            while (number2 < 4) {
                System.out.println("Banana " + number2);
                number2++;
            }
            number2 = 0;
        }
    }
}
