package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/temperatureconfusion
 * 
 * @author allwi
 *
 */
public class TemperatureConfusion {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split("/");

        int fup = Integer.parseInt(sts[0]);
        int fdown = Integer.parseInt(sts[1]);

        int cup = 5 * (fup - 32 * fdown);
        int cdown = 9 * fdown;

        int gcd = getGCD(Math.abs(cup), Math.abs(cdown));

        int cupf = cup / gcd;
        int cdownf = cdown / gcd;

        w.write(cupf + "/" + cdownf);
        w.flush();
        w.close();
        r.close();
    }

    static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        return getGCD(b, a % b);
    }

}
