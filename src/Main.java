import java.util.Scanner;
import entities.TicTacToe;
import entities.Player;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();

        System.out.println("Player 1 name:");
        String player1Name = sc.next();
        System.out.println("Player 1 mark:");
        char player1Mark = sc.next().charAt(0);

        System.out.println("Player 2 name:");
        String player2Name = sc.next();
        System.out.println("Player 2 mark:");
        char player2Mark = sc.next().toUpperCase().charAt(0);

        Player player1 = new Player(player1Name, player1Mark);
        Player player2 = new Player(player2Name, player2Mark);

        Player currentPlayer;
        boolean toggleMove = true;
        boolean hasFinished = false;

        while (!hasFinished) {
            ticTacToe.showTable();

            if (toggleMove) {
                currentPlayer = player1;
            } else {
                currentPlayer = player2;
            }

            System.out.printf("%s turn!%n", currentPlayer.name);

            System.out.println("Linha:");
            int row = sc.nextInt();

            System.out.println("Coluna:");
            int col = sc.nextInt();

            ticTacToe.markOnTable(row, col, currentPlayer.getMark());

            if (ticTacToe.winner(currentPlayer)) {
                System.out.printf("%s win!", currentPlayer.name);
                currentPlayer.setPoints(1);
                hasFinished = true;
            } else if (ticTacToe.getTotalMoves() > 8) {
                System.out.println("Draw in the game!");
                hasFinished = true;
            }

            toggleMove = !toggleMove;
        }

        sc.close();
    }
}