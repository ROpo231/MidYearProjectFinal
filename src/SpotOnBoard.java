public class SpotOnBoard {
    private int row;
    private int column;
    private Pieces piece;

    public SpotOnBoard(int row, int column, Pieces piece) {

        this.row = row;
        this.column = column;
        this.piece = piece;
    }


    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
    public Pieces getPiece() {
        return piece;
    }


}



















    /*

        private Pieces deCode(String code){
        int row = Integer.parseInt(code.substring(1));
        int column = "a".compareTo(code.substring(0, 1));
        return board[row][column];

    }

    private Pieces deCode(int code){
        String strCode = "" + code;
        int row = Integer.parseInt(strCode.substring(1));
        int column = "a".compareTo(strCode.substring(0, 1));
        return board[row][column];

    }
     */







