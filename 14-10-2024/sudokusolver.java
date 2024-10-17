package 14-10-2024;

public class sudokusolver {
    public static void main(String[] args) {
        sudoku(grid,0,0);
    }

    static boolean sudoku(int [][] grid, int row, int col){
        //base case
        if(row == grid.length && col == grid[0].length){
            return true;
        }
        if(col == grid[0].length){
            row++;
            col=0;
        }
        if(grid[row][col] != 0){
            return sudoku(grid, row, col+1);
        }

        //recursive case
        for(int i = 1; i<=9; i++){
            if(isValid(grid,row,col,i)){
                grid[row][col] = i;
                if(sudoku(grid, row, col+1)) return true;
            }
        }

    }

    static boolean isValid(int [][] grid, int row, int col, int num){
        for(int i=0; i<9; i++){
            if(grid[i][col] == num || grid[row][i] == num) return false;
        }
        int sr = row - (row%3);
        int sc = col - (col%3);
        for(int i = sr; i<sr + 3; i++){
            for(int j = sc; j < sc+3; j++){
                if(grid[i][j] == num) return false;
            }
        }
        return true;
    }
}
