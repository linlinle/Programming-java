package project;

public class GameEntry {
    private String name;
    private int score;
    /** Constructs a game entry with given parameters */
    public GameEntry(String n,int s){
        name = n;
        score = s;
    }
    /**Returns the name field*/
    public String getName(){return name;}
    /** Returns the score field. */
    public int getScore() {return score;}
    /** Returns a string representation of this entry. */
    @Override
    public String toString() {
        return "(" + name +","+score+")";
    }
}

/** 用于以非递减顺序在数组中存储高分. */
class Scoreboard {
    private int numEntries = 0;
    private GameEntry[] board;
    public Scoreboard(int capacity){
        board = new GameEntry[capacity];
    }
    /** Attempt to add a new score to the collection (if it is high enough) */
    public void add(GameEntry e){
        int newScore = e.getScore();
        if (numEntries < board.length || newScore > board[numEntries-1].getScore()){
            if (numEntries < board.length)
                numEntries++;
            // 向右移动任何较低的分数，为新条目腾出空间
            int j = numEntries-1;
            while (j>0 && board[j-1].getScore()<newScore){
                board[j] = board[j-1];
                j--;
            }
            board[j] = e;
        }
    }
    /** Remove and return the high score at index i. */
    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if (i<0 || i>=numEntries)
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        GameEntry temp = board[i];
        for (int j=i;j<numEntries-1;j++)
            board[j]= board[j+1];
        board[numEntries-1] = null;
        numEntries--;
        return temp;
    }
    /** Insertion-sort of an array of characters into nondecreasing order */
    public static void insertionSort(char[] data){
        int n = data.length;
        for (int k=1;k<n;k++){
            char cur = data[k];
            int j=k;
            while (j>0 && data[j-1]>cur){
                data[j] = data[j-1];
                j--;
            }
            data[j] = cur;
        }
    }
}