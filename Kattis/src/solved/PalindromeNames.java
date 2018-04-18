package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/names
 * 
 * @author allwi
 *
 */
public class PalindromeNames {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s = new StringTokenizer(r.readLine());
        String name = s.nextToken();
        int count = 100;
        for (int i = 0; i < name.length(); i++) {
            int temp = i;
            int left = i;
            int right = name.length() - 1;
            while (left <= right) {
                if (name.charAt(left) != name.charAt(right)) {
                    temp++;
                }
                left++;
                right--;
            }
            count = Math.min(count, temp);
        }
        w.write(String.valueOf(count));
        w.flush();
        w.close();
        r.close();

    }
}
