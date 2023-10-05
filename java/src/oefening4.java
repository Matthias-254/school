import java.util.Scanner;

public class oefening4 {

    public static void main(String[] args) {

        Scanner scanny = new Scanner(System.in);

        System.out.println("geef het eerste getal in: ");
        int eerstegetal = scanny.nextInt();

        System.out.println("geef het tweede getal in: ");
        int tweedegetal = scanny.nextInt();

        System.out.println("Input first number: " + eerstegetal);
        System.out.println("Input second number: " + tweedegetal);

        System.out.println(eerstegetal + "*" + tweedegetal + "=" + (eerstegetal*tweedegetal));
    }
}
