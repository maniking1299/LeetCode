class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if (image[sr][sc] == color)
            return image;

        fill(image, sr, sc, image[sr][sc], color);

        return image;

    }

    public void fill(int[][] image, int sr, int sc, int stColor, int color) {

        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != stColor)
            return;

        image[sr][sc] = color;

        fill(image, sr + 1, sc, stColor, color);
        fill(image, sr - 1, sc, stColor, color);
        fill(image, sr, sc + 1, stColor, color);
        fill(image, sr, sc - 1, stColor, color);

    }

}