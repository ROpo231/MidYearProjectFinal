public class Pieces {
    private String pieceType;
    private boolean onBoard;
    public Pieces (String pieceType){
        this.pieceType = pieceType;
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
}
