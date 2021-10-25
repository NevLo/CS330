package Commands;
import Pieces.*;

public class QueenCommand implements ChessCommands{
  QueenPiece q;
  public QueenCommand(QueenPiece q){
    this.q = q;
  }
  public void execute(){
    q.move();
  }

  public void undo(){
    q.undoMove();
  }

}