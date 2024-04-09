public class Board {
    private Piece[][] board;
    private Piece[] digRight;
    private Piece[] digLeft;


    public Board(){
        board = new Piece[4][4];
        digRight = new Piece[]{board[0][0], board[1][1], board[2][2], board[3][3]};
        digLeft = new Piece[]{board[0][3], board[1][2], board[2][1], board[3][0]};
    }


    public void showBoard(){
        String str = "";
        for(Piece[] x : board){
            for(Piece y : x){
                if(y == null){
                    str += "-";
                } else if(!y.getIsRed()){
                    str += "O";
                }else{
                    str += "X";
                }
            }

        }
        String zero = str.substring(0,4);
        String zero1 = str.substring(4,8);
        String zero2 = str.substring(8,12);
        String zero3 = str.substring(12,16);

        System.out.println(zero3 + "\n" + zero2 + "\n" + zero1 + "\n" + zero + "\n" );
    }
    public void addPiece(int column, boolean redTurn){
        for(int i = 0 ; i < 4; i++){
            if(board[i][column] == null){
                if(redTurn){
                    board[i][column] = new Red(redTurn);
                }else{
                    board[i][column] = new Yellow(redTurn);
                }
                break;
            }
        }
    }

    public Piece winnerChecker(){
        digRight = new Piece[]{board[0][0], board[1][1], board[2][2], board[3][3]};
        digLeft = new Piece[]{board[0][3], board[1][2], board[2][1], board[3][0]};

        int tempRed;
        int tempYellow;
        for(Piece[] x : board){
            tempRed = 0;
            tempYellow = 0;
            for (Piece y : x){
                if(y != null && y.type().equals("red")){
                    tempRed++;
                    if(tempRed == 4){
                        return new Red(true);
                    }
                }
                if (y != null && y.type().equals("yellow")){
                    tempYellow++;
                    if(tempYellow == 4){
                        return new Yellow(false);
                    }
                }
            }

        }

        for(int i = 0; i < board[0].length; i++){
            tempRed = 0;
            tempYellow = 0;
            for (int j = 0; j < board.length; j++) {
                if(board[j][i] != null && board[j][i].type().equals("red")){
                    tempRed++;
                    if(tempRed == 4){
                        return new Red(true);
                    }
                }
                if (board[j][i] != null && board[j][i].type().equals("yellow")){
                    tempYellow++;
                    if(tempYellow == 4){
                        return new Yellow(false);
                    }
                }
            }
        }
        tempRed = 0;
        tempYellow = 0;
        for(Piece x : digRight) {

            if (x != null && x.type().equals("red")) {
                tempRed++;
                if (tempRed == 4) {
                    return new Red(true);
                }
            }
            if (x != null && x.type().equals("yellow")) {
                tempYellow++;
                if (tempYellow == 4) {
                    return new Yellow(false);
                }
            }
        }
        tempRed = 0;
        tempYellow = 0;
        for(Piece x : digLeft) {

            if (x != null && x.type().equals("red")) {
                tempRed++;
                if (tempRed == 4) {
                    return new Red(true);
                }
            }
            if (x != null && x.type().equals("yellow")) {
                tempYellow++;
                if (tempYellow == 4) {
                    return new Yellow(false);
                }
            }
        }
        return new Piece();

    }
    public boolean tie(){
        for(Piece[] x : board){
            for(Piece y : x){
                if(y == null){
                    return false;
                }

            }
        }
        return true;
    }


}
