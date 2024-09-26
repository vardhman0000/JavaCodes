package Practice.Array;
import java.util.*;

public class Game {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner inp = new Scanner(System.in);


        int score = 100;
        int guessedNum = 0 ;

        while(score > 0){
            int num = r.nextInt(101);
            System.out.print("Guess the Number : ");
            guessedNum = inp.nextInt();

            if(guessedNum == num){
                score += 20;
                System.out.println("+20");
            }
            else if(Math.abs(guessedNum - num) > 5){
                score -= 20;
                System.out.println("-20");
            }
            else if((Math.abs(guessedNum - num)) <= 5){
                score += 10;
                System.out.println("+10");
            }
        }
        System.out.println("Game Over!!!");
    }
}
