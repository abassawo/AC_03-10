package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 3/10/15.
 */
public class FizzBuzz{
    public static void main (String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && 5 ==0)   //If the number can be divided evenly by 3 or 5, it is a multiple of both
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)  //multipled of 3 --> Fizz
                System.out.println("Fizz");
            else if (i % 5 == 0)   //multiples of 5 --> Buzz
                System.out.println("Buzz");
            else {
                System.out.println(i);
            }

        }
    }
}

