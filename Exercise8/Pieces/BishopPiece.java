package Pieces;
public class BishopPiece extends Pieces{
  //moves 1 forward  
  public BishopPiece(){
    x = 0;
    y = 0;
  }
  public BishopPiece(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void move(){
    String prev = "" + getColumnLetter() + getRow();
    updatePosition(x+4, y+4);
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("Bishop moves from " + prev + " to " + newPos);
  }
  public void undoMove(){
    String prev = "" + getColumnLetter() + getRow();
    x = prev_x;
    y = prev_y;
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("Bishop moves from " + prev + " to " + newPos);
  }

}