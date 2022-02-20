package Algorithms_1.Day_7;

public class maxarea_island {
    boolean[][] seen;
    public int calcArea(int[][] grid, int x, int y){
        if(x<0||y<0|| x>=grid.length||y>=grid[0].length || seen[x][y] || grid[x][y]==0)
            return 0;
        seen[x][y] = true;
        return 1+ calcArea(grid, x-1, y) + calcArea(grid, x+1, y) + calcArea(grid, x, y-1) + calcArea(grid, x, y+1);
        
    }
    public int maxAreaOfIsland(int[][] grid){
        seen = new boolean[grid.length][grid[0].length];
        int max_area=0;
        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[0].length; j++)
                max_area = Math.max(max_area, calcArea(grid, i, j));
        }
        return max_area;
    }
}
