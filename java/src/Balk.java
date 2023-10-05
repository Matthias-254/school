import java.util.Scanner;

public class Balk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wat is de hoogte? (in cm): ");
        double hoogte = sc.nextDouble();

        System.out.println("Wat is de breedte? (in cm): ");
        double breedte = sc.nextDouble();

        System.out.println("Wat is de diepte? (in cm): ");
        double diepte = sc.nextDouble();

        double opp = 2*((diepte*breedte) + (diepte*hoogte) + (hoogte*breedte));
        double volume = hoogte*breedte*diepte;

        System.out.println("De oppervlakte van de balk is " + opp + "cm^2.");
        System.out.println("Het volume van de balk is " + volume + "cm^3.");
    }
}