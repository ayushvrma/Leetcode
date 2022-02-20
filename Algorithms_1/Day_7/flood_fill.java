package Algorithms_1.Day_7;

import java.util.*;

public class flood_fill {
    public void floodfillrec(int[][] image, int sr, int sc, int curr, int newColor){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=curr)
            return;
        image[sr][sc] = newColor;
        floodfillrec(image, sr-1, sc, curr, newColor);
        floodfillrec(image, sr+1, sc, curr, newColor);
        floodfillrec(image, sr, sc-1, curr, newColor);
        floodfillrec(image, sr, sc+1, curr, newColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int curr = image[sr][sc];
        if(curr==newColor) return image;
        floodfillrec(image,sr,sc,curr,newColor);
        return image;
    }
    public static void main(String[] args) {
        flood_fill o = new flood_fill();
        int in[][] = {{0,0,0}, {0,0,0}};
        System.out.println(in[0].length);
        int[][] image = o.floodFill(in, 0, 0, 2);
        for(int i=0; i<2;i++)
            for(int j=0;j<3;j++)
                System.out.print(image[i][j]);
    }
}
