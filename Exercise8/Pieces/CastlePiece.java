package Pieces;
public class CastlePiece extends Pieces{
  //moves 1 forward  
  public CastlePiece(){
    x = 0;
    y = 0;
  }
  public CastlePiece(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void move(){
    String prev = "" + getColumnLetter() + getRow();
    updatePosition(x, y + 5);
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("Castle moves from " + prev + " to " + newPos);
  }
  public void undoMove(){
    String prev = "" + getColumnLetter() + getRow();
    x = prev_x;
    y = prev_y;
    String newPos = "" + getColumnLetter() + getRow();
    System.out.println("Castle moves from " + prev + " to " + newPos);
  }

}