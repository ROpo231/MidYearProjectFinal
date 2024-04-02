public class Pieces {
    private String pieceType;
    private boolean onBoard;
    private boolean isWhite;
    private boolean firstMove;

    public Pieces (String pieceType, boolean isWhite){
        this.pieceType = pieceType;
        this.isWhite = isWhite;
        onBoard = true;
    }
    public String getPieceType(){
        return pieceType;
    }
    public boolean getOnBoard(){
        return onBoard;
    }
    public void setOnBoard(){
        onBoard = false;
    }
    public boolean getIfWhite(){
        return isWhite;
    }





}
