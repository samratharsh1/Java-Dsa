import java.util.*;
public class tictacktoe {
    static char[][] board = new char[3][3];
    static char currentPlayer = 'X';
    
    public static void main(String[] args) {
        initializeBoard();
        Scanner sc = new Scanner(System.in);
        boolean gameActive = true;
        
        System.out.println("=== Tic Tac Toe ===");
        
        while(gameActive) {
            displayBoard();
            System.out.println("Current Player: " + currentPlayer);
            
            int position = -1;
            boolean validMove = false;
            
            while(!validMove) {
                System.out.print("Enter position (1-9): ");
                position = sc.nextInt();
                
                if(position < 1 || position > 9) {
                    System.out.println("Invalid position! Enter 1-9");
                    continue;
                }
                
                int row = (position - 1) / 3;
                int col = (position - 1) % 3;
                
                if(board[row][col] != ' ') {
                    System.out.println("Position already taken!");
                    continue;
                }
                
                board[row][col] = currentPlayer;
                validMove = true;
            }
            
            if(checkWin()) {
                displayBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameActive = false;
            } else if(isBoardFull()) {
                displayBoard();
                System.out.println("It's a tie!");
                gameActive = false;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        
        sc.close();
    }
    
    static void initializeBoard() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    static void displayBoard() {
        System.out.println();
        for(int i = 0; i < 3; i++) {
            System.out.print(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            System.out.println();
            if(i < 2) System.out.println("-----------");
        }
        System.out.println();
    }
    
    static boolean checkWin() {
        // Check rows
        for(int i = 0; i < 3; i++) {
            if(board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                return true;
        }
        
        // Check columns
        for(int j = 0; j < 3; j++) {
            if(board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer)
                return true;
        }
        
        // Check diagonals
        if(board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
            return true;
        if(board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
            return true;
        
        return false;
    }
    
    static boolean isBoardFull() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
}
