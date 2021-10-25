package Commands;
import Pieces.*;

public class KingCommand implements ChessCommands{
  KingPiece k;
  public KingCommand(KingPiece k){
    this.k = k;
  }
  public void execute(){
    k.move();
  }

  public void undo(){
    k.undoMove();
  }

}