package recursion.tictactoe;

public interface Player {
    Move getMoveFor(GameState state);
    String getName();
    char getCharacter();
}
