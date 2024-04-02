//This is gonna be the place where i store the grid and stuff

public class Board {
    private Pieces[][] board;
    public Board (){
        board = new Pieces[8][8];
        /*Numbers board
        [56][57][58][59][60][61][62][63]
        [48][49][50][51][52][53][54][55]
        [40][41][42][43][44][45][46][47]
        [32][33][34][35][36][37][38][39]
        [24][25][26][27][28][29][30][31]
        [16][17][18][19][20][21][22][23]
        [08][09][10][11][12][13][14][15]
        [00][01][02][03][04][05][06][07]







          8  [56][57][58][59][60][61][62][63]    black
          7  [48][49][50][51][52][53][54][55]
          6  [40][41][42][43][44][45][46][47]
          5  [32][33][34][35][36][37][38][39]
          4  [24][25][26][27][28][29][30][31]
          3  [16][17][18][19][20][21][22][23]
          2  [08][09][10][11][12][13][14][15]
          1  [00][01][02][03][04][05][06][07]  white
                          K  Q
               A   B   C   D   E   F   G  H
         */
//white  pieces on board
        board[1][0] = new Pawn( true);
        board[1][1] = new Pawn( true);
        board[1][2] = new Pawn( true);
        board[1][3] = new Pawn( true);
        board[1][4] = new Pawn( true);
        board[1][5] = new Pawn( true);
        board[1][6] = new Pawn( true);
        board[1][7] = new Pawn( true);
        board[0][0] = new Rook( true);
        board[0][1] = new Bishop(true);
        board[0][2] = new Knight(true);
        board[0][3] = new King(true);
        board[0][4] = new Queen(true);
        board[0][5] = new Knight(true);
        board[0][6] = new Bishop(true);
        board[0][7] = new Rook(true);
//black pieces on board
        board[6][0] = new Pawn( false);
        board[6][1] = new Pawn( false);
        board[6][2] = new Pawn( false);
        board[6][3] = new Pawn( false);
        board[6][4] = new Pawn( false);
        board[6][5] = new Pawn( false);
        board[6][6] = new Pawn( false);
        board[6][7] = new Pawn( false);
        board[7][0] = new Rook( false);
        board[7][1] = new Bishop(false);
        board[7][2] = new Knight(false);
        board[7][3] = new King(false);
        board[7][4] = new Queen(false);
        board[7][5] = new Knight(false);
        board[7][6] = new Bishop(false);
        board[7][7] = new Rook(false);
    }
    public Pieces[][] getBoard(){
        return board;
    }
    public void showBoard(){
        for(Pieces[] pRow: board){
            for(Pieces p: pRow){
                if(p != null) {
                    System.out.print(" " + p.getPieceType());
                }else{
                    System.out.print(" null");
                }
            }
            System.out.println();
        }
    }

    public void rotateSides(){
        Pieces[][] tempBoard = new Pieces[8][8];
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j< board[0].length;j++){
                Pieces tempVar = tempBoard[board.length-1-i][j];
                tempBoard[board.length-1-i][j] = board[i][j];
                board[i][j] =tempVar;
            }
        }
        board = tempBoard;
    }
    //check to see if valid moves
    //check to see if pieces can make that move
    public void takeTurn(String sPoint, String ePoint, boolean whiteMove){
        if(onBoard(sPoint) && onBoard(ePoint) && (deCode(sPoint).getIfWhite() == whiteMove)){

        }
        System.out.println("Cant do that!");

    }

    //checks if the turn is on the board
    private boolean onBoard(String pTurn){
        try{
            deCode(pTurn);
            return true;

        }catch(Exception e){
            return false;
        }
    }
    private Pieces deCode(String code){
        int row = Integer.parseInt(code.substring(1));
        int column = "a".compareTo(code.substring(0, 1));
        return board[row][column];

    }





}
