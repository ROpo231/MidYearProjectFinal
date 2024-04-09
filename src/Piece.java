public class Piece {
    private boolean isRed;

    public Piece(boolean x){
        isRed = x;
    }
    public Piece( ){

    }
    public boolean getIsRed(){
        return isRed;
    }

    public String type(){
        return "Piece";
    }
}
