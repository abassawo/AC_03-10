package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/10/15.
 */
import java.util.Scanner;
public class revisitedLoop {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int Initial, MaxValue, Increment;

        System.out.println("What number would you like to start with?");
        Initial = input.nextInt();

        System.out.println("What number would you like to end with?");
        MaxValue = input.nextInt();

        System.out.println("What increment?");
        Increment = input.nextInt();

        for (int i = Initial; i < MaxValue; i = i + Increment){
            System.out.println(i);
        }


    }
}
