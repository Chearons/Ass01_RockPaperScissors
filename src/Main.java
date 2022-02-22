import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        System.out.println("Lets Play Rock Paper Scissors! ");
        do {
            //asks users for inputs
            String A;
            String B;
            do{
                System.out.print("playerA choose Rock, Paper, or Scissors: [R,P,S] ");
                A = sc.next().toUpperCase();
                if (!(A.equals("R") || A.equals("P") || A.equals("S"))) {
                    System.out.println("Invalid Input, Try Again");
                }
            } while (!(A.equals("R") || A.equals("P") || A.equals("S")));
            do {
                System.out.print("playerB choose Rock, Paper, or Scissors: [R,P,S] ");
                B = sc.next().toUpperCase();
                if (!(B.equals("R") || B.equals("P") || B.equals("S"))) {
                    System.out.println("Invalid Input, Try Again");
                }
            } while (!(B.equals("R") || B.equals("P") || B.equals("S")));

            //computes the answer
            if (A.equals("R")) {
                if (B.equals("R")) {
                    System.out.println("Rock vs Rock it's a tie");
                } else if (B.equals("P")) {
                    System.out.println("Rock vs Paper (Paper Covers Rock! ) Player B wins");
                } else if (B.equals("S")) {
                    System.out.println("Rock vs Scissors (Rock Beats Scissors!) Player A wins");
                }
            } else if (A.equals("P")) {
                if (B.equals("R")) {
                    System.out.println("Paper vs Rock (Paper Covers Rock!) Player A wins");
                } else if (B.equals("P")) {
                    System.out.println("Paper vs Paper It's a tie");
                } else if (B.equals("S")) {
                    System.out.println("Paper vs Scissors (Scissors Cuts Paper!) Player B wins");
                }
            } else if (A.equals("S")) {
                if (B.equals("R")) {
                    System.out.println("Scissors vs Rock (Rock Beats Scissors!) Player B wins");
                } else if (B.equals("P")) {
                    System.out.println("Scissors vs Paper (Scissors Cuts Paper!) Player A wins");
                } else if (B.equals("S")) {
                    System.out.println("Scissors vs Scissors It's a tie");
                }
            }

            //prompts to play again
            String ans;
            do {
                System.out.print("Play again? [Y/N]: ");
                ans = sc.next().toUpperCase();
                if (ans.equals("N")) {
                    end = true;
                }
            } while (!(ans.equals("Y") || ans.equals("N")));
        } while(!end);
    }
}
