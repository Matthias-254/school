import java.util.Scanner;

public class extraWerkcollegeSwitch3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bent u student?");
        String student = sc.next();

        System.out.println("Geef u leeftijd:");
        int leeftijd = sc.nextInt();

        if(leeftijd > 65){
            System.out.println("Uw bioscoopkaartje kost: €9,6");
        }else if(leeftijd <= 65 && leeftijd > 0) {
            switch (student) {
                case "ja":
                    System.out.println("Uw bioscoopkaartje kost: €8,4");
                    break;

                case "nee":
                    System.out.println("Uw bioscoopkaartje kost: €12");
                    break;

                default:
                    System.out.println("Foutieve invoer!");
            }
        }else{
            System.out.println("Foutieve invoer!");
        }
    }
}

