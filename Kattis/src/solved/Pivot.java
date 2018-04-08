package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/pivot
 * 
 * @author allwi
 *
 */
public class Pivot {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());
        final String[] sts = r.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sts[i]);
        }

        int leftMax = Integer.MIN_VALUE;
        int[] leftMaxs = new int[n];

        int rightMin = Integer.MAX_VALUE;
        int[] rightMins = new int[n];

        for (int i = 0; i < n; i++) {
            leftMaxs[i] = leftMax;
            if (arr[i] > leftMax) {
                leftMax = arr[i];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            rightMins[i] = rightMin;
            if (arr[i] < rightMin) {
                rightMin = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= leftMaxs[i] && arr[i] < rightMins[i]) {
                count++;
            }
        }
        w.write(String.valueOf(count));
        w.flush();
        w.close();
        r.close();
    }

}
