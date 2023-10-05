import java.util.Scanner;

public class extraWerkcollegeSwitch5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Voer getal1 in:");
        double getal1 = sc.nextDouble();

        System.out.println("Geef getal2 in:");
        double getal2 = sc.nextDouble();

        System.out.println("Welke bewerking wil je doen (+, -, * of /)?");
        char bewerking = sc.next().charAt(0);

        double resultaat = 0;

        switch(bewerking){

            case '+':
                resultaat = getal1 + getal2;
                break;

            case '-':
                resultaat = getal1 - getal2;
                break;

            case '*':
                resultaat = getal1 * getal2;
                break;

            case '/':
                if(getal2 != 0){
                    resultaat = getal1 / getal2;
                }else{
                    System.out.println("Je kan niet delen door 0!");
                    System.exit(1);
                }
                break;

            default:
                System.out.println("Foutieve invoer!");
                System.exit(1);
        }

        System.out.println("Je uitkomst is: " + resultaat);
    }
}