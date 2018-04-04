package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/speedlimit
 * 
 * @author allwi
 *
 */
public class SpeedLimit {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(r.readLine());
            if (n == -1) {
                break;
            }
            int[] speed = new int[n];
            int[] time = new int[n];
            for (int i = 0; i < n; i++) {
                StringTokenizer s = new StringTokenizer(r.readLine());
                speed[i] = Integer.parseInt(s.nextToken());
                time[i] = Integer.parseInt(s.nextToken());
            }

            int miles = speed[0] * time[0];
            for (int i = 1; i < n; i++) {
                int temp = speed[i] * (time[i] - time[i - 1]);
                miles += temp;
            }
            w.write(Integer.toString(miles) + " miles\n");
        }
        w.flush();
        w.close();
        r.close();
    }

}
