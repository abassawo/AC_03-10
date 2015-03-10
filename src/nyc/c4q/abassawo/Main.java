package nyc.c4q.abassawo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner xInput = new Scanner(System.in);
        System.out.print("Give me a number ");
       int x = xInput.nextInt();
       for (int i = 0; i < x; i++){
           System.out.println(i);
       }

    }
}
