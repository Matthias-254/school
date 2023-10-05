import java.util.Scanner;

public class BijhoudenSaldo{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-Saldo bijhouden-\n");

        int saldo = 0;

        while(saldo >= 0 || saldo < 1000000){
            System.out.println("Voer de operatie in: ");
            int operatie = sc.nextInt();

            saldo += operatie;
            System.out.println("Je saldo is nu: " + saldo);
        }
    }
}