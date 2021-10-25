package Commands;
import Pieces.*;

public class BishopCommand implements ChessCommands{
  BishopPiece b;
  public BishopCommand(BishopPiece b){
    this.b = b;
  }
  public void execute(){
    b.move();
  }

  public void undo(){
    b.undoMove();
  }

}