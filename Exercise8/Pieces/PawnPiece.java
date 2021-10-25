package Pieces;
public class PawnPiece extends Pieces{
  //moves 1 forward  
  public PawnPiece(){
    x = 0;
    y = 0;
  }
  public PawnPiece(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void move(){
    String prev = "" + getColumnLetter() + getRow();
    updatePosition(x, y + 1);
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("Pawn moves from " + prev + " to " + newPos);
  }
  public void undoMove(){
    String prev = "" + getColumnLetter() + getRow();
    x = prev_x;
    y = prev_y;
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("Pawn moves from " + prev + " to " + newPos);
  }

}