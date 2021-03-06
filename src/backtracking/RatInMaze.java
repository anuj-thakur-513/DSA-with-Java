package backtracking;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {{1,1,0},{0,1,0},{0,1,1}};
        boolean hasPath = ratInMaze(maze);
        System.out.println(hasPath);
    }

    static boolean ratInMaze(int[][] maze){
        int n = maze.length;
        int[][] path = new int[n][n];
        return solveMaze(maze, 0, 0, path);
    }

    static boolean solveMaze(int[][] maze, int i, int j, int[][] path){
        // check if i, j cell is valid or not
        int n = maze.length;
        if (i < 0 || i > n || j < 0 || j > n || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }
        // include the cell in current path
        path[i][j] = 1;
        // destination cell
        if (i == n - 1 && j == n - 1){
            for (int k = 0; k < n; k++){
                for (int l = 0; l < n; l++){
                    System.out.print(path[k][l] + " ");
                }
                System.out.println();
            }
            return true;
        }

        // explore further in all directions
        // top
        if (solveMaze(maze, i - 1, j, path)){
            return true;
        }
        // right
        if (solveMaze(maze, i, j + 1, path)){
            return true;
        }
        // down
        if (solveMaze(maze, i + 1, j, path)){
            return true;
        }
        // left
        if (solveMaze(maze, i, j - 1, path)){
            return true;
        }
        return false;
    }
}
