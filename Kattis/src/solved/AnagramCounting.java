package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/anagramcounting
 * 
 * @author allwi
 *
 */
public class AnagramCounting {

    static Map<String, Integer> temp;

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = r.readLine()) != null) {
            temp = new HashMap<>();
            String[] sts = line.split("");
            BigInteger total = getFactorial(sts.length);
            for (String s : sts) {
                if (temp.containsKey(s)) {
                    temp.put(s, temp.get(s) + 1);
                } else {
                    temp.put(s, 1);
                }
            }
            for (Integer in : temp.values()) {
                total = total.divide(getFactorial(in));
            }

            w.write(String.valueOf(total) + "\n");
            w.flush();
        }
        w.close();
        r.close();
    }

    public static BigInteger getFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
