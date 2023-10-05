import java.util.Scanner;

public class schrikkeljaar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geef het jaartal in: ");
        int jaartal = sc.nextInt();

        if (jaartal % 400 == 0 || (jaartal%100!=0 && jaartal%4 ==0)){

            System.out.println("Dit is een schrikkeljaar");
        }else{
            System.out.println("Dit is geen schrikkeljaar");
        }
    }
}