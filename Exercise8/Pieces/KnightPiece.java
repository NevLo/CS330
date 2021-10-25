package Pieces;
public class KnightPiece extends Pieces{
  //moves 2 forward and 1 left
  public KnightPiece(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void move(){
    String prev = "" + getColumnLetter() + getRow();
    updatePosition(x + 1, y + 2);
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("Knight jumps from " + prev + " to " + newPos);
  }
  public void undoMove(){
    String prev = "" + getColumnLetter() + getRow();
    x = prev_x;
    y = prev_y;
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("Knight jumps from " + prev + " to " + newPos);
  }
}