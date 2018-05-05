package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/loworderzeros
 * 
 * @author allwi
 *
 */
public class LowOrderZeros {

    final static int[] modUpToTen = { 1, 1, 2, 6, 4, 2, 2, 4, 2, 8 };

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        // http://blog.sina.com.cn/s/blog_4b36463501008vlr.html
        String line;
        while ((line = r.readLine()) != null) {
            if (line.equals("0")) {
                break;
            }
            int last = getLastNonZeroDigit(Integer.parseInt(line));
            w.write(String.valueOf(last) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

    static int getLastNonZeroDigit(int n) {
        if (n < 10) {
            return modUpToTen[n];
        }
        if (((n / 10) % 10) % 2 == 0) {
            return (6 * getLastNonZeroDigit(n / 5) * modUpToTen[n % 10]) % 10;
        } else {
            return (4 * getLastNonZeroDigit(n / 5) * modUpToTen[n % 10]) % 10;
        }
    }

}
