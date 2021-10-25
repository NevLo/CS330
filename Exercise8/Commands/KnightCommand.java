package Commands;
import Pieces.*;

public class KnightCommand implements ChessCommands{
  KnightPiece k;
  public KnightCommand(KnightPiece k){
    this.k = k;
  }
  public void execute(){
    k.move();
  }

  public void undo(){
    k.undoMove();
  }

}