import java.util.Scanner;

public class getallenOmzetten {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geef de score op 20");
        int score = sc.nextInt();

        char charScore = ' ';

        if(score < 0 || score > 21){
            System.out.println("Foutieve invoer");
        }else{
            if(score < 10){
                charScore = 'C';
            }else if(score >= 10 && score < 12){
                charScore = 'B';
            }else if(score >= 12){
                charScore = 'A';
            }
        }
        System.out.println("Eindscore: \n" + charScore);
    }
}