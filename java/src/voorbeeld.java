import java.util.Scanner;

public class voorbeeld {

    public static void main(String[] args) {

        Scanner scanny = new Scanner(System.in);

        System.out.println("geef de hooghte in: ");
        int hoogte = scanny.nextInt();

        System.out.println(hoogte);

        System.out.println("geef mij de breedte, max 5");
        int breedte = scanny.nextInt();
        if(breedte <= 5 && hoogte <= 5){
            System.out.println("de opp van de boer is: " + (hoogte*breedte));
        }
        else{
            System.out.println("Kan opp niet berekenen. De boer speelt vals!");
        }
    }
}