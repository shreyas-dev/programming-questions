package dev.shreyas.java.programs.arrays.graphs;

/**
 * @author shreyas b
 * @created 10/05/2020 - 3:08 PM
 * @project programming-questions
 **/

/*
You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

Example 1:
    Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
    Output: true
Example 2:
    Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
    Output: false

Constraints:
    2 <= coordinates.length <= 1000
    coordinates[i].length == 2
    -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
    coordinates contains no duplicate point.
 */

public class StraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1= coordinates[0][1];

        if(coordinates.length==1){
            return true;
        }

        // if a line is straight then the slope will be constant.

        float slope=slope(x1,y1,coordinates[1][0],coordinates[1][1]);
        for(int i=2;i<coordinates.length;i++){
            if(slope != slope(x1,y1,coordinates[i][0],coordinates[i][1]))
                return false;
        }
        return true;
    }

    // slope = (y2-y1)/ (x2 - x1)
    public float slope(int x1,int y1,int x2,int y2){
        return ((float)y2-y1)/(x2-x1);
    }
}
