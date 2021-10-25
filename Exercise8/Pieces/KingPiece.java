package Pieces;
public class KingPiece extends Pieces{
  //moves 1 forward  
  public KingPiece(){
    x = 0;
    y = 0;
  }
  public KingPiece(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void move(){
    String prev = "" + getColumnLetter() + getRow();
    updatePosition(x+1, y);
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("King moves from " + prev + " to " + newPos);
  }
  public void undoMove(){
    String prev = "" + getColumnLetter() + getRow();
    x = prev_x;
    y = prev_y;
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("King moves from " + prev + " to " + newPos);
  }

}