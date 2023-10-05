import java.util.Scanner;

public class oefSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geef een keuze");

        char keuze = sc.next().charAt(0);

        switch(keuze){

            case '+':
                System.out.println("getal 1 + getal 2");
                break;

            case '-':
                System.out.println("getal 1 - getal 2");
                break;

            case '*':
                System.out.println("getal 1 * getal 2");
                break;

            case '/':
                System.out.println("getal 1 / getal 2");
                break;

            default:
                System.out.println("Foutieve invoer!");
        }
    }
}
