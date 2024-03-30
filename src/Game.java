public class Game {
    private boolean gameOver;
    private boolean whiteMove;

    public Game(){
        gameOver = false;
        whiteMove = true;
    }
    public void menu(){
        System.out.println("Welcome to The Game Chess\nAll you have to do is specify the piece then write what location you want to the piece to go to");
        while(!gameOver){
            if(whiteMove){
                //method to move pieces
                whiteMove = false;
            }else{
                //method to move pieces
                whiteMove = true;
            }
        }
    }

    public void


}
