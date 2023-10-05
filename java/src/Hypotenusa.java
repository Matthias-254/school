import java.util.Scanner;

public class Hypotenusa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wat is de lengte van A? ");
        double lengteA = sc.nextInt();

        System.out.println("Wat is de lengte van B? ");
        double lengteB = sc.nextInt();

        double lengteC = Math.sqrt((Math.pow(lengteA, 2)) + (Math.pow(lengteB, 2)));

        System.out.println("Lengte van Hypotenusa " + lengteC);
    }
}