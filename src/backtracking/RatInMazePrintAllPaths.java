package backtracking;

public class RatInMazePrintAllPaths {
    public static void main(String[] args) {
        int[][] maze = {{1, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        ratInMaze(maze);
    }

    static void ratInMaze(int[][] maze) {
        int n = maze.length;
        int[][] path = new int[n][n];
        printPaths(maze, 0, 0, path);
    }

    static void printPaths(int[][] maze, int i, int j, int[][] path) {
        // check if i, j cell is valid or not
        int n = maze.length;
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }
        // include the cell in current path
        path[i][j] = 1;
        // destination cell
        if (i == n - 1 && j == n - 1) {
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    System.out.print(path[k][l] + " ");
                }
                System.out.println();
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }

        // explore further in all directions
        // top
        printPaths(maze, i - 1, j, path);
        // right
        printPaths(maze, i, j + 1, path);
        // down
        printPaths(maze, i + 1, j, path);
        // left
        printPaths(maze, i, j - 1, path);
        path[i][j] = 0;
    }
}
