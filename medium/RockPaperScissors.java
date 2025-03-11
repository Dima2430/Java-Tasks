package medium;
import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {
     static int playerScore = 0;
     static int robotScore = 0;
     static ArrayList<Character> playerMoves = new ArrayList<>();
    public static char getI() {
        double random = Math.random() * 3 + 1;
        int rounded = (int) Math.round(random);
        if (rounded == 1) {
            return 'r';
        } else if (rounded == 2) {
            return 'p';
        } else {
            return 's';
        }
    }

    public static String getWinner(char p) {
       
        char robot = getI();
    
    if (p == robot) {
        return "It's a tie! Both chose " + p;
    }
    
    
    if (p == 'r' && robot == 's') {
        playerScore++;
        return "The player won, the robot had scissors.";
    } else if (p == 'p' && robot == 'r') {
        playerScore++;
        return "The player won, the robot had rock.";
    } else if (p == 's' && robot == 'p') {
        playerScore++;
        return "The player won, the robot had paper.";
    }
    
    // If the player didn't win and it's not a tie, the robot wins
    if (robot == 'r' && p == 's') {
        robotScore++;
        return "The robot won, the player had scissors.";
    } else if (robot == 'p' && p == 'r') {
         robotScore++;
        return "The robot won, the player had rock.";
    } else if (robot == 's' && p == 'p') {
         robotScore++;
        return "The robot won, the player had paper.";
    }
    
    // Handle invalid input (if the player's move is not 'r', 'p', or 's')
    return "Invalid move by the player.";
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (robotScore < 3 && playerScore < 3) {
            String input = scanner.nextLine();
            playerMoves.add(input.charAt(0));
            System.out.println(getWinner(input.charAt(0)));
        }
        if (playerScore >= 3) {
            System.out.println("Congratulations! You won the game!");
        } else if (robotScore >= 3) {
            System.out.println("Sorry, the robot won the game.");
        }
        scanner.close();
        
    }
}
