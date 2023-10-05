import java.util.Scanner;

public class extraWerkcollegeSwitch2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Voer een filmgenre in: ");
        String filmgenre = sc.next();

        switch(filmgenre){

            case "actie":
                System.out.println("De actiefilm is een filmgenre waarbij actiescènes van groot belang zijn.");
                System.out.println("Een bekende film binnen dit genre is: The Interprenter");
                break;

            case "romantiek":
                System.out.println("Een romantische film is een filmgenre waarin de liefde tussen twee personages centraal staat.");
                System.out.println("Een bekende film binnen dit genre is: Love at First Sight");
                break;

            case "horror":
                System.out.println("Een horrorfilm, griezelfilm of gruwelfilm is een film waarin angst (Latijn: horror) het hoofdthema vormt.");
                System.out.println("Een bekende film binnen dit genre is: Smile");
                break;

            default:
                System.out.println("Foutieve invoer!");
        }
    }
}
