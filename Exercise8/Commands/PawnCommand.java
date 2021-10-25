package Commands;
import Pieces.*;

public class PawnCommand implements ChessCommands{
  PawnPiece p;

  public PawnCommand(PawnPiece p){
    this.p = p;
  }

  public void execute(){
    p.move();
  }
  public void undo(){
    p.undoMove();
  }
}