package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/mjehuric
 * 
 * @author allwi
 *
 */
public class Mjehuric {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");
        int[] arr = new int[sts.length];
        for (int i = 0; i < sts.length; i++) {
            arr[i] = Integer.parseInt(sts[i]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    print(arr, w);
                }
            }
        }
        w.flush();
        w.close();
        r.close();
    }

    private static void print(int[] arr, BufferedWriter w) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        w.write(sb.toString() + "\n");
    }

}
