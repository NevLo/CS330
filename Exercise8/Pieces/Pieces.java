package Pieces;
public abstract class Pieces {
  protected int x;
  protected int y;
  protected int prev_x;
  protected int prev_y;

  public abstract void move();

  public abstract void undoMove();

  public char getColumnLetter() {
    return (char) (x + 64);
  }

  public int getRow() {
    return y;
  }

  public int getCol() {
    return x;
  }

  public void updatePosition(int x, int y) {
    prev_x = this.x;
    prev_y = this.y;
    this.x = x;
    this.y = y;
  }

}