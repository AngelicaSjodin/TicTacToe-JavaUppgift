import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String one =" ";
        String two =" ";
        String three =" ";
        String four =" ";
        String five =" ";
        String six =" ";
        String seven =" ";
        String eight =" ";
        String nine =" ";

        String line =
                "o|o|o\n"+
                "-+-+-\n"+
                "o|o|o\n"+
                "-+-+-\n"+
                "o|o|o";

        String ok =
                        one+"|"+two+"|"+three+"\n"+
                        "-+-+-\n"+
                                four+"|"+five+"|"+six+"\n"+
                        "-+-+-\n"+
                                seven+"|"+eight+"|"+nine+"\n";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Player1 name:");
        String name = scanner.nextLine();

        Boolean running=true;
        while(running) {
            System.out.println(ok);
            System.out.println(name + "s turn, pick a available number 1-9");

            int choice = scanner.nextInt();
            int i = 1;
            if (choice == i){
                one ="x";
            }

            System.out.println(ok);
        }
    }

}