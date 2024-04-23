package Modals;
public class Game {
    Board board;
    List<Player> Players;
    int nextPlayerMoveIndex;
    Player winner;
    List<Move> Moves;
    enum GameState{INPROGRESS, ENDED, DRAW;}
}
