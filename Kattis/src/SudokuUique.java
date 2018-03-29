import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/sudokunique
 * 
 * @author allwi
 *
 */
public class SudokuUique {

    private static int dimension = 9;
    private static int counter;
    private static int[][] sudoku = new int[dimension][dimension];
    private static int[][] solution = new int[dimension][dimension];

    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            counter = 0;
            for (int i = 0; i < dimension; i++) {
                StringTokenizer s = new StringTokenizer(r.readLine());
                int tem = 0;
                while (s.hasMoreTokens() && tem < dimension) {
                    String token = (String) s.nextToken();
                    sudoku[i][tem] = Integer.parseInt(token);
                    tem++;
                }
            }

            solver(0, 0);

            if (counter == 0) {
                w.write("Find another job\n");
            } else if (counter == 1) {
                for (final int[] array : solution) {
                    for (final int element : array) {
                        w.write(Integer.toString(element) + " ");
                    }
                    w.newLine();
                }
                w.newLine();
            } else {
                w.write("Non-unique\n");
            }
            w.flush();

            if (r.readLine() == null) {
                break;
            } else {
                continue;
            }
        }
        r.close();
        w.close();
    }

    private static boolean solver(final int row, final int col) throws Exception {
        int currentRow, currentCol, tempNum;

        if (row == 8 && col == 8) {
            return true;
        }

        if (sudoku[row][col] == 0) {
            for (int num = 1; num <= 9; num++) {
                if (isSafe(row, col, num)) {
                    sudoku[row][col] = num;
                    if (col == 8) {
                        currentCol = 0;
                        currentRow = row + 1;
                    } else {
                        currentCol = col + 1;
                        currentRow = row;
                    }
                    if (solver(currentRow, currentCol)) {
                        getSolution();
                        counter++;
                    }
                    sudoku[row][col] = 0;
                }
            }
        } else {
            tempNum = sudoku[row][col];
            sudoku[row][col] = 0;
            if (isSafe(row, col, tempNum)) {
                if (col == 8) {
                    currentCol = 0;
                    currentRow = row + 1;
                } else {
                    currentCol = col + 1;
                    currentRow = row;
                }
                sudoku[row][col] = tempNum;
                if (solver(currentRow, currentCol)) {
                    counter++;
                }
            } else {
                sudoku[row][col] = tempNum;
            }
        }
        return false;
    }

    private static boolean isSafe(final int row, final int col, final int num) {

        for (final int element : sudoku[row]) {
            if (element == num) {
                return false;
            }
        }

        for (int tempRow = 0; tempRow < dimension; tempRow++) {
            if (sudoku[tempRow][col] == num) {
                return false;
            }
        }

        final int tempBoxRow = row - row % 3;
        final int tempBoxCol = col - col % 3;
        for (int tempRow = 0; tempRow < 3; tempRow++) {
            for (int tempCol = 0; tempCol < 3; tempCol++) {
                if (sudoku[tempBoxRow + tempRow][tempBoxCol + tempCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void getSolution() {
        for (int i = 0; i < dimension; i++) {
            int[] temp = sudoku[i];
            System.arraycopy(temp, 0, solution[i], 0, dimension);
        }
    }
}
