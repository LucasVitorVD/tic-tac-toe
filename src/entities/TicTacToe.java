package entities;

public class TicTacToe {
    public static final Character[][] table = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    private int totalMoves = 0;

    public void showTable() {
        System.out.println("    0   1   2 ");

        for (int i = 0; i < table.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("| %s ", table[i][j]);

                if (j == 2) {
                    System.out.println();
                }
            }
        }
    }

    public int getTotalMoves() {
        return totalMoves;
    }

    public void markOnTable(int row, int col, char mark) {
        if (table[row][col] == ' ') {
            table[row][col] = mark;
            totalMoves++;
        } else {
            System.out.println("There is already a mark!");
        }
    }

    public boolean winner(Player currentPlayer) {
        boolean hasWinner = false;

        if (table[0][0] == currentPlayer.getMark() && table[0][1] == currentPlayer.getMark() && table[0][2] == currentPlayer.getMark()) {
            hasWinner = true;
        } else if (table[1][0] == currentPlayer.getMark() && table[1][1] == currentPlayer.getMark() && table[1][2] == currentPlayer.getMark()) {
            hasWinner = true;
        } else if (table[2][0] == currentPlayer.getMark() && table[2][1] == currentPlayer.getMark() && table[2][2] == currentPlayer.getMark()) {
            hasWinner = true;
        } else if (table[0][0] == currentPlayer.getMark() && table[1][0] == currentPlayer.getMark() && table[2][0] == currentPlayer.getMark()) {
            hasWinner = true;
        } else if (table[0][1] == currentPlayer.getMark() && table[1][1] == currentPlayer.getMark() && table[2][1] == currentPlayer.getMark()) {
            hasWinner = true;
        } else if (table[0][2] == currentPlayer.getMark() && table[1][2] == currentPlayer.getMark() && table[2][2] == currentPlayer.getMark()) {
            hasWinner = true;
        } else if (table[0][0] == currentPlayer.getMark() && table[1][1] == currentPlayer.getMark() && table[2][2] == currentPlayer.getMark()) {
            hasWinner = true;
        } else if (table[0][2] == currentPlayer.getMark() && table[1][1] == currentPlayer.getMark() && table[2][0] == currentPlayer.getMark()) {
            hasWinner = true;
        }

        return hasWinner;
    }
}
