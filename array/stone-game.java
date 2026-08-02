class Solution {
    int[][] t = new int[501][501];

    public boolean stoneGame(int[] piles) {

        int n = piles.length;

        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        int total = 0;
        for (int i : piles) {
            total += i;
        }

        int alice = solve(0, n - 1, piles);
        int bob = total - alice;

        return alice > bob;

    }

    public int solve(int i, int j, int[] piles) {

        if (i > j)
            return 0;
        if (i == j)
            return piles[i];

        if (t[i][j] != -1) {
            return t[i][j];
        }

        int take_i = piles[i] + Math.min(solve(i + 2, j, piles), solve(i + 1, j - 1, piles));
        int take_j = piles[j] + Math.min(solve(i + 1, j - 1, piles), solve(i, j - 2, piles));

        return t[i][j] = Math.max(take_i, take_j);
    }
}