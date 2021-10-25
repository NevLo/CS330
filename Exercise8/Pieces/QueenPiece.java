package Pieces;
public class QueenPiece extends Pieces{
  //moves 1 forward  
  public QueenPiece(){
    x = 0;
    y = 0;
  }
  public QueenPiece(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void move(){
    String prev = "" + getColumnLetter() + getRow();
    updatePosition(x, y + 3);
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("Queen moves from " + prev + " to " + newPos);
  }
  public void undoMove(){
    String prev = "" + getColumnLetter() + getRow();
    x = prev_x;
    y = prev_y;
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("Queen moves from " + prev + " to " + newPos);
  }

}