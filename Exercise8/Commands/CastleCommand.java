package Commands;
import Pieces.*;

public class CastleCommand implements ChessCommands{
  CastlePiece c;
  public CastleCommand(CastlePiece c){
    this.c = c;
  }
  public void execute(){
    c.move();
  }

  public void undo(){
    c.undoMove();
  }

}