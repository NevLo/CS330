public class Board{
  Player P1;
  Player P2;

  boolean PTurn; //White is true, Black is false

  public Board(){
    P1 = new Player("White");
    P2 = new Player("Black");
    PTurn = true;


  }

  public void Play(){
    P1.movePiece(1);
    P2.movePiece(0);
    P1.movePiece(0);
    P1.undoMove();
    P1.movePiece(0);
  }
}