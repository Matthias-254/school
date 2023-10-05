import java.util.Scanner;

public class Eindcijfer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geef deel 1 (op 20):");
        double deel1 = sc.nextDouble();
        System.out.println("Geef deel 2 (op 20):");
        double deel2 = sc.nextDouble();
        System.out.println("Geef deel 3 (op 20):");
        double deel3 = sc.nextDouble();
        System.out.println("Geef deel 4 (op 20):");
        double deel4 = sc.nextDouble();

        double pntdeel1 = (deel1/20)*15;
        double pntdeel2 = (deel2/20)*25;
        double pntdeel3 = deel3;
        double pntdeel4 = (deel4/20)*40;

        double totaal = (pntdeel1+pntdeel2+deel3+pntdeel4)/5;
        System.out.println("Het totaal cijfer van de student: " + totaal + "/20");
    }
}