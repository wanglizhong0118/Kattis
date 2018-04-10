package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/height
 * 
 * @author allwi
 *
 */
public class HeightOrdering {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            String[] sts = r.readLine().split(" ");
            int[] arr = new int[20];
            for (int j = 1; j < 21; j++) {
                arr[j - 1] = Integer.parseInt(sts[j]);
            }

            int count = 0;
            for (int k = 0; k < 20; k++) {
                for (int j = 0; j < 19; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        count++;
                    }
                }
            }
            w.write(String.valueOf(i + 1) + " " + String.valueOf(count) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }
}
