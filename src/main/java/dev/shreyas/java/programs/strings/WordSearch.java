package dev.shreyas.java.programs.strings;

/*
    Given a 2D board and a word, find if the word exists in the grid.
    The word can be constructed from letters of sequentially adjacent cell,
    where "adjacent" cells are those horizontally or vertically neighboring.
    The same letter cell may not be used more than once.

Example:
    board =
    [
      ['A','B','C','E'],
      ['S','F','C','S'],
      ['A','D','E','E']
    ]

    Given word = "ABCCED", return true.
    Given word = "SEE", return true.
    Given word = "ABCB", return false.
 */

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        // base checks
        if (word == null || word.length() == 0)
            return true;
        // iterate through every cell to get the first character
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                // use dfs and find other characters
                if (board[i][j] == word.charAt(0) && dfs(board,word,0,i,j))
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word,int index,int i,int j){
        // if index is reached then we found the word in the board
        if (word.length() == index){
            return true;
        }
        // boundary checks & also if board[i][j] doesn't match word[index]
        if (i<0 ||  i>=board.length || j<0 || j>=board[i].length || board[i][j]!= word.charAt(index)){
            return false;
        }
        char temp = board[i][j];
        // marking it as visited using space char so that it won't be visited again
        board[i][j] = ' ';

        boolean found =     dfs(board,word,index+1,i-1,j)
                        ||  dfs(board,word,index+1,i+1,j)
                        ||  dfs(board,word,index+1,i,j-1)
                        ||  dfs(board,word,index+1,i,j+1);

        // we need to put the board back to the previous state
        board[i][j] = temp;
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
                            {'A', 'B', 'C', 'E'},
                            {'S', 'F', 'C', 'S'},
                            {'A', 'D', 'E', 'E'}
                        };
        WordSearch wordSearch = new WordSearch();
        System.out.println(wordSearch.exist(board,"ABCCED"));
        System.out.println(wordSearch.exist(board,"SEE"));
        System.out.println(wordSearch.exist(board,"ABCB")); // ABCB cannot be formed
    }
}
