public class sudoku {
    public static boolean isSafe(int suduko[][], int row, int col, int digit) {
        // column
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        // 3*3
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true ;
    }
    public static boolean sudokuSolver(int sudoku [][],int row,int col){
        
    }
}
