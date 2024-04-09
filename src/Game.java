import java.util.Scanner;

public class Game {
    private boolean gameOver;
    private boolean redTurn;
    private Board board;
    private Scanner scan;
    public Game(){
        gameOver = false;
        redTurn = true;
        board = new Board();
        scan = new Scanner(System.in);
    }

    public void start(){
        System.out.println("Enter numbers 1 - 4 to pick the columns!! (Red is X and Yellow is O (Red first))");
        while(!gameOver){
            board.showBoard();
            System.out.println("Player pick a column: ");
            String answer = scan.nextLine();
            int num = Integer.parseInt(answer) - 1;
            board.addPiece(num, redTurn);
            redTurn = !redTurn;
            String winner = board.winnerChecker().type();
            if(!winner.equals("Piece")){
                board.showBoard();
                System.out.println(winner.toUpperCase() + "  Won!!!!");
                gameOver = true;
            }
            if(board.tie()){
                board.showBoard();
                System.out.println("Game tie");
                gameOver = true;
            }



        }

    }



}
