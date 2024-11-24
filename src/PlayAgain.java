import java.util.Objects;
import java.util.Scanner;
public class PlayAgain {
    public static void question(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("play again? Type yes or no");
        String answer = scanner.next();

        while(true) {
            if (Objects.equals(answer, "yes") || Objects.equals(answer, "Yes") || Objects.equals(answer, "y")) {
                System.out.println("You chose to play again!");
                System.out.println("Second goes first this time.");

                startAgain();                       //activates grid reset if wanting to restart
                break;

            } else if (Objects.equals(answer, "no") || Objects.equals(answer, "No") || Objects.equals(answer, "n")) {
                System.out.println("hope you play again! Bye!");
                break;                              //breaks loop if not wanting to play again
            } else {
                System.out.println("invalid answer try again.");
                answer = scanner.next();            //have to re-enter if player typed invalid answer
            }
        }
    }

    public static void startAgain(){
        Grid.resetGrid();
    }
}
