import java.util.*;

public class FloodFillAlgo {

    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {

        // Boundary + condition checks
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length
                || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        // Mark visited
        vis[sr][sc] = true;

        // Change color
        image[sr][sc] = color;

        // left
        helper(image, sr, sc - 1, color, vis, orgCol);

        // right
        helper(image, sr, sc + 1, color, vis, orgCol);

        // up
        helper(image, sr - 1, sc, color, vis, orgCol);

        // down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgCol = image[sr][sc];

        // Optimization (important)
        if (orgCol == color) return image;

        boolean[][] vis = new boolean[image.length][image[0].length];

        helper(image, sr, sc, color, vis, orgCol);

        return image;
    }

    // For testing
    public static void main(String[] args) {
        FloodFillAlgo obj = new FloodFillAlgo();

        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int sr = 1, sc = 1, color = 2;

        int[][] result = obj.floodFill(image, sr, sc, color);

        // Print result
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}