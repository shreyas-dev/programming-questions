package dev.shreyas.java.programs.graphs;

/*
    Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is
    surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
    You may assume all four edges of the grid are all surrounded by water.

Example 1:
    Input:
    11110
    11010
    11000
    00000
Output: 1

Example 2:
Input:
11000
11000
00100
00011
Output: 3

 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        // Base Condition, just a check
        if ( grid == null && grid.length == 0 && grid[0].length == 0){
            return 0;
        }
        int numOfIsland = 0;
        // iterating through as the tiles
        for (int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++){
                // we are only interested if we find a one
                if (grid[i][j]=='1'){
                    numOfIsland += dfs(grid,i,j);
                }
            }
        return numOfIsland;
    }
    // this function goes to neighbouring 1's and convert those to
    // visited by marking it as '0',
    public int dfs(char[][] grid,int i,int j){
        // if true , recursion is done
        if(i< 0 || i >= grid.length || j < 0 || j>= grid[i].length || grid[i][j] =='0')
            return 0;
        // mark the island as visited
        grid[i][j] ='0';
        // visit 4 neighbouring tiles to check for 1's
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
        // if 1's are connected , it'll form an island together, hence 1.
        return 1;
    }
}
