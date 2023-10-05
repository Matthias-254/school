import java.util.Scanner;

public class loops{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char keuze;
        int getal1 = 0;
        int getal2 = 0;

        do{
            System.out.println("Menu: kies +, -, * of / en q om te stoppen");
            keuze = sc.next().charAt(0);

            if(keuze == '+' || keuze == '-' || keuze == '*' || keuze == '/'){

                System.out.println("getal1:");
                getal1 = sc.nextInt();

                System.out.println("Getal2:");
                getal2 = sc.nextInt();
            }

            switch(keuze){

                case '+':
                    System.out.println("De som is: " + (getal1 + getal2));
                    break;

                case '-':
                    System.out.println("Het verschil is: " + (getal1 - getal2));
                    break;

                case '*':
                    System.out.println("De vermenigvuldiging is: " + (getal1 * getal2));
                    break;

                case '/':
                    System.out.println("De deling is: " + (getal1 / getal2));
                    break;

                default:
                    System.out.println("Foutieve invoer!");
            }

        }while(keuze != 'q');

    }
}