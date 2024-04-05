import java.util.Scanner;

public class Game {
    private boolean gameOver;
    public boolean whiteMove;
    private Scanner scan;
    private Board board;

    public Game(){
        gameOver = false;
        whiteMove = true;
        scan = new Scanner(System.in);
    }

    /*
    public void menu(){
        System.out.println("Welcome to The Game Chess\nAll you have to do is specify the piece then write what location you want to the piece to go to");
        while(!gameOver){
            System.out.println("Where is the piece you want to move?: ");
            String startingPoint = scan.nextLine().toLowerCase();
            System.out.println("Where do you want it to go?");
            String endingPoint = scan.nextLine().toLowerCase();
            //Method to move pieces 2 parameters starting piece location , destination
            //board.takeTurn(startingPoint, endingPoint, whiteMove);
            whiteMove = !whiteMove;

        }
    }
    //decode the positions
    //check the positions on the board (weather they are there or not )
    //


     */


}
