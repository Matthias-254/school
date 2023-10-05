import java.util.Scanner;

public class extraWerkcollegeSwitch4 {;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wat is u jaarlijkse inkomen?");
        Double inkomen = sc.nextDouble();

        System.out.println("Wat is u burgerlijke staat (alleenstaand,  gehuwd of samenwonend)?");
        String burgerlijkeStaat = sc.next();

        double korting = 0;
        double belasting = 0;

        switch(burgerlijkeStaat){

            case "alleenstaand":
                korting = 2000;
                break;

            case "gehuwd":
                korting = 1000;
                break;

            case "samenwonend":
                korting = 500;
                break;

            default:
                System.out.println("Foutieve invoer!");
        }

        if (inkomen <= 15000) {
            belasting = (inkomen - korting) * 0.20;
        } else if (inkomen <= 20000) {
            belasting = (15000 - korting) * 0.20 + (inkomen - 15000) * 0.30;
        } else if (inkomen <= 50000) {
            belasting = (15000 - korting) * 0.20 + (20000 - 15000) * 0.30 + (inkomen - 20000) * 0.40;
        } else {
            belasting = (15000 - korting) * 0.20 + (20000 - 15000) * 0.30 + (50000 - 20000) * 0.40 + (inkomen - 50000) * 0.55;
        }

        System.out.println("U moet €" + belasting + " aan belastingen betalen.");
    }
}