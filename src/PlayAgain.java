import java.util.Objects;
import java.util.Scanner;
public class PlayAgain {
    public static void question(char[][] running, boolean grid){
        Scanner scanner = new Scanner(System.in);

        System.out.println("play again? Type yes or no");
        String answer = scanner.next();

        while(true) {
            if (Objects.equals(answer, "yes") || Objects.equals(answer, "Yes") || Objects.equals(answer, "y")) {
                System.out.println("You chose to play again!");
                System.out.println("Second goes first this time.");

                startAgain();
                break;

            } else if (Objects.equals(answer, "no") || Objects.equals(answer, "No") || Objects.equals(answer, "n")) {
                System.out.println("hope you play again! Bye!");
                break;
            } else {
                System.out.println("invalid answer try again.");
                answer = scanner.next();
            }
        }
    }

    public static void startAgain(){
        Grid.resetGrid();
    }
}
