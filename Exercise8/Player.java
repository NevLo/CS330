import java.util.ArrayList;

import Commands.*;
import Pieces.*;

public class Player{
  ArrayList<Pieces> piecesList;
  ArrayList<ChessCommands> commandsList;
  String color;

  public Player(String color){
    piecesList = new ArrayList<>();
    commandsList = new ArrayList<>();
    this.color = color;
    setPiece(new PawnPiece(1,1));
    setPiece(new KnightPiece(1,2));
  }

  public void setPiece(Pieces piece){
    piecesList.add(piece);
  }

  public void setCommand(ChessCommands command){
    commandsList.add(command);
  }

  public void movePiece(int index){
    System.out.print(color + ": ");
    if(index == 0) setCommand(new PawnCommand((PawnPiece)piecesList.get(index)));
    else setCommand(new KnightCommand((KnightPiece)piecesList.get(index)));

    commandsList.get(commandsList.size() - 1).execute();
  }
  public void undoMove(){
    System.out.print(color + ": UNDO: ");
    commandsList.get(commandsList.size() - 1).undo();
    commandsList.remove(commandsList.size() - 1);
  }
}