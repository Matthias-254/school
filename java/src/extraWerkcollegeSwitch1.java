import java.util.Scanner;

public class extraWerkcollegeSwitch1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geef het dagnummer in: ");
        char dagnummer = sc.next().charAt(0);

        switch(dagnummer){

            case '1':
                System.out.println("Maandag");
                break;

            case '2':
                System.out.println("Dinsdag");
                break;

            case '3':
                System.out.println("Woensdag");
                break;

            case '4':
                System.out.println("Donderdag");
                break;

            case '5':
                System.out.println("Vrijdag");
                break;

            case '6':
                System.out.println("Zaterdag");
                break;

            case '7':
                System.out.println("Zondag");
                break;

            default:
                System.out.println("Foutieve invoer!");

        }
    }
}
