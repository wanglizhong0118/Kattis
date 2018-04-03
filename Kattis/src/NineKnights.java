import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/nineknights
 * 
 * @author allwi
 *
 */
public class NineKnights {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] board = new String[5][5];
        boolean isValid = true;

        int nk = 0;
        for (int i = 0; i < 5; i++) {
            String[] sts = r.readLine().split("");
            for (int j = 0; j < 5; j++) {
                board[i][j] = sts[j];
                if (sts[j].equals("k")) {
                    nk++;

                }
            }
        }
        search: {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (board[i][j].equals("k")) {
                        if (!isValid(board, i, j)) {
                            isValid = false;
                            break search;
                        }
                    }
                }
            }
        }

        if (nk != 9) {
            w.write("invalid");
        } else {
            if (isValid) {
                w.write("valid");
            } else {
                w.write("invalid");
            }
        }
        w.flush();
        w.close();
        r.close();

    }

    private static boolean isValid(String[][] b, int i, int j) {

        int up = i - 2;
        int down = i + 2;
        int udLeft = j - 1;
        int udRight = j + 1;

        int left = j - 2;
        int right = j + 2;
        int lrUp = i - 1;
        int lrdown = i + 1;

        if (up >= 0 && up <= 4 && udLeft >= 0 && udLeft <= 4 && b[up][udLeft].equals("k")) {
            return false;
        } else if (up >= 0 && up <= 4 && udRight >= 0 && udRight <= 4 && b[up][udRight].equals("k")) {
            return false;
        } else if (down >= 0 && down <= 4 && udLeft >= 0 && udLeft <= 4 && b[down][udLeft].equals("k")) {
            return false;
        } else if (down >= 0 && down <= 4 && udRight >= 0 && udRight <= 4 && b[down][udRight].equals("k")) {
            return false;
        }

        else if (left >= 0 && left <= 4 && lrUp >= 0 && lrUp <= 4 && b[lrUp][left].equals("k")) {
            return false;
        } else if (left >= 0 && left <= 4 && lrdown >= 0 && lrdown <= 4 && b[lrdown][left].equals("k")) {
            return false;
        } else if (right >= 0 && right <= 4 && lrUp >= 0 && lrUp <= 4 && b[lrUp][right].equals("k")) {
            return false;
        } else if (right >= 0 && right <= 4 && lrdown >= 0 && lrdown <= 4 && b[lrdown][right].equals("k")) {
            return false;
        }

        return true;
    }

}
