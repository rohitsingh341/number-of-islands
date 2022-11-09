package co.rohit.dsa;

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid = {
//                {'1','1','1','0','0'},
//                {'1','1','0','1','0'},
//                {'1','1','0','0','0'},
//                {'0','0','1','0','1'},
                {'1','1','0'},
                {'1','0','0'},
                {'0','0','0'},
        };

        int count = getNumOfIslands(grid);
        System.out.println("Number of Islands -> " + count);
    }

    public static int getNumOfIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(char[][] grid, int i, int j) {
        // edge cases

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
    }
}
