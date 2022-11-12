import java.util.Random;
public class Die {
    public static void main(String args[]) {
        Random random = new Random();
        System.out.print("The value on dice is: "
                + (random.nextInt(6) + 1));
    }
}