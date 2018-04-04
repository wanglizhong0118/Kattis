package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * https://open.kattis.com/problems/plantingtrees
 * 
 * @author allwi
 *
 */
public class PlantingTrees {
    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        String[] sts = r.readLine().split(" ");
        int[] sd = new int[n];
        for (int i = 0; i < n; i++) {
            sd[i] = Integer.parseInt(sts[i]);
        }
        Arrays.sort(sd);

        int temp = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (sd[i] - i + n > temp) {
                temp = sd[i] - i + n;
            }
        }

        w.write(String.valueOf(temp + 1));
        w.flush();
        w.close();
        r.close();
    }
}
