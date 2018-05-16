
/**
 * This class represents the board for a Tic Tac Toe Game
 * 
 * @author Kristen Cruthers
 */
public class Board
{
    // An array (list) of Strings. X for a x game piece, O for an o game piece and a 1 to 9 for unoccupied spaces
    private String[] board;
    
    //A constant variable that holds the number of positions available on the board
    private final int NUM_POS = 9;

    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        // initialize instance variables
        board = new String[NUM_POS];
        
        //Fill with spaces so it is an empty board
        for (int i = 0; i < NUM_POS; i = i + 1)
        {
            board[i] = i + 1 + "";
        }
    }

    /**
     * Set a position on the board with an X or an O
     * 
     * @param  pos     the number of the position to update (0 to 8)
     * @param  value   X or O 
     */
    public void setPosition(int pos, String value)
    {
        //subtract one from pos, since the user will enter in a 1 to 9, and we need 0 to 8 for the array
        pos = pos - 1;
        // update the board array at the postion that was given, with the value that was given
        board[pos] = value;
    }
    
     /**
     * Get the value at a position on the board
     * 
     * @param  pos     the number of the position for where we want to know the value (0 to 8)
     * @return         X or O or 1 to 9 (empty space)
     */
    public String getPosition(int pos)
    {
        //subtract one from pos, since the user will enter in a 1 to 9, and we need 0 to 8 for the array
        pos = pos - 1;
        
        // return the value that is at the position given by the caller
        return board[pos];
    }
    
}
