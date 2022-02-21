package Algorithms_1.Day_9;

public class matrix_01 {
    public int nearestZero(int[][]mat, int x, int y){
        int dist = 0;
        if(x<0 || y<0 || x>=mat.length || y>=mat[0].length || mat[x+1][y]==0 || mat[x][y+1]==0 || mat[x-1][y]==0 || mat[x][y-1]==0){
            return dist;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int distance[][] = new int[mat.length][mat[0].length];
        
        return distance;
    }
}
