import java.util.Scanner;

public class NaamLeeftijd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wat is uw naam");
        String naam = sc.nextLine();

        System.out.println("Wat is uw geboortejaar");
        int geboortejaar = sc.nextInt();

        int leeftijd = 2023 - geboortejaar;

        System.out.println(naam + " is " + leeftijd + " jaar oud.");
    }
}
