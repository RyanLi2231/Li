import java.util.Random;

public class Bacon {
    public static void main(String[] args) {
        System.out.println("Bacon Making");
        String Bacon;
        int rand = (int) (Math.random() * 2);
        if (rand == 0) {
            Bacon = "Crunchy Bacon";
        } else {
            Bacon = "Chewy Bacon";
        }
        System.out.println(Bacon);
        rand = (int) (Math.random() * 2);
        if (rand == 0) {
            Bacon += "Apple Pie";
        } else {
            Bacon += "Banana Split";
        }
    }
}
