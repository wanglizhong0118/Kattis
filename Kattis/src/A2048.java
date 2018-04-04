
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/2048
 * 
 * @author allwi
 *
 */
public class A2048 {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] temp = new int[4][4];

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(r.readLine());
            for (int j = 0; j < 4; j++) {
                temp[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int op = Integer.parseInt(r.readLine());

        switch (op) {
        case 0:
            left(temp);
            break;
        case 1:
            up(temp);
            break;
        case 2:
            right(temp);
            break;
        case 3:
            down(temp);
            break;
        default:
            break;
        }

    }

    private static void left(int[][] board) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

            }
        }

    }

    private static void up(int[][] board) {
        // TODO Auto-generated method stub

    }

    private static void right(int[][] board) {
        // TODO Auto-generated method stub

    }

    private static void down(int[][] board) {
        // TODO Auto-generated method stub

    }
}
